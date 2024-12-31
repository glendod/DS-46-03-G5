package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.*;
import com.kelompok5.ishuttle.service.KursiService;
import com.kelompok5.ishuttle.service.PembayaranService;
import com.kelompok5.ishuttle.service.ShuttleService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.time.LocalDateTime;



@Controller
public class PembayaranController {

    @Autowired
    private PembayaranService pembayaranService;

    @Autowired
    private KursiService kursiService;

    @Autowired
    private ShuttleService shuttleService;

    @PostMapping("/lanjut-pembayaran")
    public String lanjutPembayaran(@RequestParam("selectedKursiId") Long selectedKursiId, 
                                   @RequestParam("shuttleId") Long shuttleId, 
                                   @RequestParam("penumpangId") Long penumpangId, 
                                   Model model) {
        model.addAttribute("selectedKursiId", selectedKursiId);
        model.addAttribute("shuttleId", shuttleId);
        model.addAttribute("penumpangId", penumpangId);
        BigDecimal harga = (shuttleService.cariShuttleById(shuttleId)).getHarga();      
        model.addAttribute("harga",harga);
        return "pembayaran"; // Halaman pembayaran
    }

    @PostMapping("/proses-pembayaran")
    public String prosesPembayaran(@RequestParam("action") String action, 
                                   @RequestParam("metodePembayaran") String metodePembayaran, 
                                   @RequestParam("selectedKursiId") Long selectedKursiId, 
                                   @RequestParam("shuttleId") Long shuttleId, 
                                   @RequestParam("penumpangId") Long penumpangId, 
                                   Model model,
                                   HttpSession session) {

        System.out.println(selectedKursiId);
        System.out.println(shuttleId);
        System.out.println(penumpangId);    
        User user = (User) session.getAttribute("user");
              
        if ("cancel".equals(action)) {
            // Jika pengguna membatalkan pembayaran

            Pembayaran pembayaran = new Pembayaran();

            pembayaran.setMetodePembayaran(MetodePembayaran.valueOf(metodePembayaran));
            pembayaran.setStatus(StatusPembayaran.CANCEL);
            pembayaran.setTanggalPembayaran(LocalDateTime.now());
            pembayaran.setUser(user);

            // Set relasi objek
            Kursi kursi = new Kursi();
            kursi.setId(selectedKursiId);
            pembayaran.setKursi(kursi);

            Shuttle shuttle = new Shuttle();
            shuttle.setId(shuttleId);
            pembayaran.setShuttle(shuttle);

            Penumpang penumpang = new Penumpang();
            penumpang.setId(penumpangId);
            pembayaran.setPenumpang(penumpang);

            // Simpan pembayaran
            pembayaranService.simpanPembayaran(pembayaran);

            return "redirect:/home";
        } else if ("confirm".equals(action)) {
            // Proses konfirmasi pembayaran
            Pembayaran pembayaran = new Pembayaran();
            pembayaran.setMetodePembayaran(MetodePembayaran.valueOf(metodePembayaran));
            pembayaran.setStatus(StatusPembayaran.TERKONFIRMASI);
            pembayaran.setTanggalPembayaran(LocalDateTime.now());
            pembayaran.setUser(user);

            // Set relasi objek
            Kursi kursi = new Kursi();
            kursi.setId(selectedKursiId);
            pembayaran.setKursi(kursi);

            Shuttle shuttle = new Shuttle();
            shuttle.setId(shuttleId);
            pembayaran.setShuttle(shuttle);

            Penumpang penumpang = new Penumpang();
            penumpang.setId(penumpangId);
            pembayaran.setPenumpang(penumpang);

            // Simpan pembayaran
            pembayaranService.simpanPembayaran(pembayaran);

            // Update kursi menjadi tidak tersedia
            kursiService.updateKetersediaanKursi(selectedKursiId, false);

            // Kurangi jumlah kursi tersisa pada shuttle
            shuttleService.kurangiKursiTersisa(shuttleId);

            return "redirect:/show-tiket?pembayaranId="+ pembayaran.getId();
        }
        return "redirect:/home";
    }

    
}

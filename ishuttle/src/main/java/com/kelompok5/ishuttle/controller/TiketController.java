package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.Tiket;
import com.kelompok5.ishuttle.service.TiketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TiketController {

    @Autowired
    private TiketService tiketService;

    @GetMapping("/show-tiket")
    public String showTiket(@RequestParam("pembayaranId") Long pembayaranId, Model model) {
        // Ambil tiket berdasarkan ID pembayaran
        Tiket tiket = tiketService.createTiketFromPembayaran(pembayaranId);

        // Tambahkan tiket ke model
        model.addAttribute("tiket", tiket);

        return "show-tiket"; // Halaman HTML
    }
}

package com.kelompok5.ishuttle.service;

import com.kelompok5.ishuttle.model.Pembayaran;
import com.kelompok5.ishuttle.model.Tiket;
import com.kelompok5.ishuttle.repository.PembayaranRepository;
import com.kelompok5.ishuttle.repository.TiketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiketService {

    @Autowired
    private TiketRepository tiketRepository;

    public Tiket simpanTiket(Tiket tiket) {
        return tiketRepository.save(tiket);
    }

    @Autowired
    private PembayaranRepository pembayaranRepository;

    public Tiket createTiketFromPembayaran(Long pembayaranId) {
        // Ambil pembayaran berdasarkan ID
        Pembayaran pembayaran = pembayaranRepository.findById(pembayaranId)
                .orElseThrow(() -> new IllegalArgumentException("Pembayaran tidak ditemukan"));

        // Buat objek tiket baru
        Tiket tiket = new Tiket();
        tiket.setPembayaran(pembayaran);
        tiket.setNamaPenumpang(pembayaran.getPenumpang().getNama());
        tiket.setNomorKursi(pembayaran.getKursi().getNomorKursi());
        tiket.setKeberangkatan(pembayaran.getShuttle().getKeberangkatan());
        tiket.setTujuan(pembayaran.getShuttle().getTujuan());
        tiket.setTanggalKeberangkatan(pembayaran.getShuttle().getTanggalKeberangkatan());
        tiket.setJamKeberangkatan(pembayaran.getShuttle().getJamKeberangkatan());
        tiketRepository.save(tiket);

        return tiket;
    }
}

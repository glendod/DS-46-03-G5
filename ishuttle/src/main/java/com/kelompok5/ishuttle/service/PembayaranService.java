package com.kelompok5.ishuttle.service;

import com.kelompok5.ishuttle.model.Pembayaran;
import com.kelompok5.ishuttle.model.StatusPembayaran;
import com.kelompok5.ishuttle.model.User;
import com.kelompok5.ishuttle.repository.PembayaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembayaranService {

    @Autowired
    private PembayaranRepository pembayaranRepository;

    public Pembayaran simpanPembayaran(Pembayaran pembayaran) {
        return pembayaranRepository.save(pembayaran);
    }

    public List<Pembayaran> cariPembayaranByPenumpangAndStatus(Long penumpangId, StatusPembayaran status) {
        return pembayaranRepository.findByPenumpangIdAndStatus(penumpangId, status);
    }

    public Pembayaran cariPembayaranById(Long id) {
        return pembayaranRepository.findById(id).orElse(null);
    }

    public List<Pembayaran> ambilRiwayatPembayaran(User user) {
        return pembayaranRepository.findByUser(user);
    }
}

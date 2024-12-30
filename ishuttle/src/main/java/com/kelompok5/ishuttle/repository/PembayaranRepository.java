package com.kelompok5.ishuttle.repository;

import com.kelompok5.ishuttle.model.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
    List<Pembayaran> findByPenumpangIdAndStatus(Long penumpangId, com.kelompok5.ishuttle.model.StatusPembayaran status);
}

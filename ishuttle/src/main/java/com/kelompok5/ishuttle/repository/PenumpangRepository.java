package com.kelompok5.ishuttle.repository;

import com.kelompok5.ishuttle.model.Penumpang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenumpangRepository extends JpaRepository<Penumpang, Long> {
    // Tambahkan metode custom jika diperlukan
}

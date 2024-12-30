package com.kelompok5.ishuttle.repository;

import com.kelompok5.ishuttle.model.Shuttle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ShuttleRepository extends JpaRepository<Shuttle, Long> {
    List<Shuttle> findByKeberangkatanAndTujuanAndTanggalKeberangkatan(String keberangkatan, String tujuan, LocalDate tanggalKeberangkatan);
}

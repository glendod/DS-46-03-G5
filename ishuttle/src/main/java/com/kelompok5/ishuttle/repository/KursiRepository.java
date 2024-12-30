package com.kelompok5.ishuttle.repository;

import com.kelompok5.ishuttle.model.Kursi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KursiRepository extends JpaRepository<Kursi, Long> {
    List<Kursi> findByShuttleIdAndKetersediaanTrue(Long shuttleId);
    List<Kursi> findByShuttleId(Long shuttleId);
}

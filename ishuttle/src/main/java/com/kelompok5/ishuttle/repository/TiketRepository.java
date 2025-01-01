package com.kelompok5.ishuttle.repository;

import com.kelompok5.ishuttle.model.Tiket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TiketRepository extends JpaRepository<Tiket, Long> {
    Optional<Tiket> findByPembayaranId(Long pembayaranId);
}

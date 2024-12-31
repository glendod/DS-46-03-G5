package com.kelompok5.ishuttle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "penumpang_id", nullable = false)
    private Penumpang penumpang;

    @ManyToOne
    @JoinColumn(name = "shuttle_id", nullable = false)
    private Shuttle shuttle;

    @OneToOne
    @JoinColumn(name = "kursi_id", nullable = false)
    private Kursi kursi;

    @Enumerated(EnumType.STRING)
    @Column(name = "metode_pembayaran", nullable = false)
    private MetodePembayaran metodePembayaran;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusPembayaran status;

    @Column(name = "tanggal_pembayaran", nullable = false)
    private LocalDateTime tanggalPembayaran = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    
}


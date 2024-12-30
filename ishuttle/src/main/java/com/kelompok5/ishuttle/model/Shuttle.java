package com.kelompok5.ishuttle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class Shuttle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_shuttle", nullable = false)
    private String namaShuttle;

    @Column(name = "jam_keberangkatan", nullable = false)
    private LocalTime jamKeberangkatan;

    @Column(nullable = false)
    private BigDecimal harga;

    @Column(nullable = false)
    private String keberangkatan;

    @Column(nullable = false)
    private String tujuan;

    @Column(name = "tanggal_keberangkatan", nullable = false)
    private LocalDate tanggalKeberangkatan;

    @Column(name = "kursi_tersisa", nullable = false)
    private Integer kursiTersisa = 9; // Default 9 kursi tersedia

    @OneToMany(mappedBy = "shuttle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Kursi> kursi;
}

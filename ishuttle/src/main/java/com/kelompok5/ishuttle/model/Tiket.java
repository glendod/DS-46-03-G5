package com.kelompok5.ishuttle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Tiket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pembayaran_id", nullable = false)
    private Pembayaran pembayaran;

    @Column(name = "nama_penumpang", nullable = false)
    private String namaPenumpang;

    @Column(name = "nomor_kursi", nullable = false)
    private Integer nomorKursi;

    @Column(nullable = false)
    private String keberangkatan;

    @Column(nullable = false)
    private String tujuan;

    @Column(name = "tanggal_keberangkatan", nullable = false)
    private LocalDate tanggalKeberangkatan;

    @Column(name = "jam_keberangkatan", nullable = false)
    private LocalTime jamKeberangkatan;
}

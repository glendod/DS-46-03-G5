package com.kelompok5.ishuttle.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Kursi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomor_kursi", nullable = false)
    private Integer nomorKursi;

    @Column(nullable = false)
    private Boolean ketersediaan = true; // Default kursi tersedia

    @ManyToOne
    @JoinColumn(name = "shuttle_id", nullable = false)
    private Shuttle shuttle;
}

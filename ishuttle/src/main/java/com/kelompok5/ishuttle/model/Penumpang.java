package com.kelompok5.ishuttle.model;

// import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Penumpang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "nomor_hp", nullable = false)
    private String nomorHp;

    // @OneToMany(mappedBy = "penumpang")
    // private List<Pembayaran> pembayaranList;
}

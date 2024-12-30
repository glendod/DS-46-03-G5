package com.kelompok5.ishuttle.service;

import com.kelompok5.ishuttle.model.Penumpang;
import com.kelompok5.ishuttle.repository.PenumpangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenumpangService {

    @Autowired
    private PenumpangRepository penumpangRepository;

    public Penumpang simpanPenumpang(Penumpang penumpang) {
        return penumpangRepository.save(penumpang);
    }

    public Penumpang cariPenumpangById(Long id) {
        return penumpangRepository.findById(id).orElse(null);
    }
}

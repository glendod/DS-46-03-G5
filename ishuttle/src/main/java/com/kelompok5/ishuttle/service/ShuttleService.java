package com.kelompok5.ishuttle.service;

import com.kelompok5.ishuttle.model.Shuttle;
import com.kelompok5.ishuttle.repository.ShuttleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ShuttleService {

    @Autowired
    private ShuttleRepository shuttleRepository;

    public List<Shuttle> cariShuttle(String keberangkatan, String tujuan, LocalDate tanggal) {
        return shuttleRepository.findByKeberangkatanAndTujuanAndTanggalKeberangkatan(keberangkatan, tujuan,tanggal);
    }

    public Shuttle cariShuttleById(Long id) {
        return shuttleRepository.findById(id).orElse(null);
    }

    public void kurangiKursiTersisa(Long shuttleId) {
        Shuttle shuttle = shuttleRepository.findById(shuttleId).orElse(null);
        if (shuttle != null && shuttle.getKursiTersisa() > 0) {
            shuttle.setKursiTersisa(shuttle.getKursiTersisa() - 1);
            shuttleRepository.save(shuttle);
        }
    }
}

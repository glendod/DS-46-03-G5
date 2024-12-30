package com.kelompok5.ishuttle.service;

import com.kelompok5.ishuttle.model.Kursi;
import com.kelompok5.ishuttle.repository.KursiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import com.kelompok5.ishuttle.repository.ShuttleRepository;
import java.util.List;

@Service
public class KursiService {

    @Autowired
    private KursiRepository kursiRepository;

    public List<Kursi> cariKursiTersedia(Long shuttleId) {
        return kursiRepository.findByShuttleIdAndKetersediaanTrue(shuttleId);
    }

    public Kursi cariKursiById(Long id) {
        return kursiRepository.findById(id).orElse(null);
    }

    public Kursi simpanKursi(Kursi kursi) {
        return kursiRepository.save(kursi);
    }

    // @Autowired
    // private ShuttleRepository shuttleRepository;

    public List<Kursi> ambilKursiDariShuttle(Long shuttleId) {
        return kursiRepository.findByShuttleId(shuttleId);
    }

    public void updateKetersediaanKursi(Long kursiId, boolean ketersediaan) {
        Kursi kursi = kursiRepository.findById(kursiId).orElse(null);
        if (kursi != null) {
            kursi.setKetersediaan(ketersediaan);
            kursiRepository.save(kursi);
        }
    }
    
}

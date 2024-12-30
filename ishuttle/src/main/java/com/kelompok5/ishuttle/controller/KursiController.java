package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.Kursi;
import com.kelompok5.ishuttle.service.KursiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class KursiController {

    @Autowired
    private KursiService kursiService;

    @GetMapping("/pilih-kursi")
    public String tampilkanKursi(@RequestParam("shuttleId") Long shuttleId,@RequestParam("penumpangId") Long penumpangId, Model model) {
        List<Kursi> kursiList = kursiService.ambilKursiDariShuttle(shuttleId);
        model.addAttribute("kursiList", kursiList);
        model.addAttribute("shuttleId", shuttleId);
        model.addAttribute("penumpangId", penumpangId);
        return "pilih-kursi";
    }
}

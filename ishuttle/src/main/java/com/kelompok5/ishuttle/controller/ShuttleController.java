package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.Shuttle;
import com.kelompok5.ishuttle.service.ShuttleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ShuttleController {

    @Autowired
    private ShuttleService shuttleService;

    @GetMapping("/cari-shuttle")
    public String cariShuttle(@RequestParam String keberangkatan, 
                          @RequestParam String tujuan, 
                          @RequestParam String tanggalKeberangkatan, 
                          Model model) {

    LocalDate tanggal = LocalDate.parse(tanggalKeberangkatan);
    List<Shuttle> hasilPencarian = shuttleService.cariShuttle(keberangkatan, tujuan, tanggal);

    model.addAttribute("shuttles", hasilPencarian);
    return "shuttle-detail";
}
}

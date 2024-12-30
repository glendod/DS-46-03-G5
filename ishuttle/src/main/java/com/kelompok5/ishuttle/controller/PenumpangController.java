package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.Penumpang;
import com.kelompok5.ishuttle.service.PenumpangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PenumpangController {

    @Autowired
    private PenumpangService penumpangService;

    @GetMapping("/form-penumpang")
    public String tampilkanFormPenumpang(@RequestParam Long shuttleId, Model model) {
        model.addAttribute("penumpang", new Penumpang());
        model.addAttribute("shuttleId", shuttleId);
        return "form-penumpang";
    }

    @PostMapping("/simpan-penumpang")
    public String simpanPenumpang(Penumpang penumpang, @RequestParam Long shuttleId) {
        penumpangService.simpanPenumpang(penumpang);
        return "redirect:/pilih-kursi?shuttleId=" + shuttleId + "&penumpangId=" + penumpang.getId();
    }
}

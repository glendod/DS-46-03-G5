package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.Pembayaran;
import com.kelompok5.ishuttle.model.User;
import com.kelompok5.ishuttle.service.PembayaranService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HistoryController {

    @Autowired
    private PembayaranService pembayaranService;

    @GetMapping("/history")
    public String tampilkanHistory(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        List<Pembayaran> pembayaranList = pembayaranService.ambilRiwayatPembayaran(user);
        model.addAttribute("pembayaranList", pembayaranList);
        return "history";
    }
}

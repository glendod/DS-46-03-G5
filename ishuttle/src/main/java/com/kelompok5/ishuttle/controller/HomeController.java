package com.kelompok5.ishuttle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String tampilkanHome(Model model) {
        return "home"; // Menuju home.html
    }
}

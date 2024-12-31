package com.kelompok5.ishuttle.controller;

import com.kelompok5.ishuttle.model.User;
import com.kelompok5.ishuttle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
        @RequestParam("identifier") String identifier,
        @RequestParam("password") String password,
        HttpSession session,
        Model model) {
    User user = userRepository.findByUsername(identifier)
            .or(() -> userRepository.findByEmail(identifier))
            .orElse(null);
    if (user != null && user.getPassword().equals(password)) {
        session.setAttribute("user", user);
        return "redirect:/home";
    }
    model.addAttribute("error", "Email/Username atau password salah!");
    return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
    if (userRepository.findByUsername(user.getUsername()).isPresent() ||
        userRepository.findByEmail(user.getEmail()).isPresent()) {
        model.addAttribute("error", "Username atau Email sudah terdaftar!");
        return "register";
    }
    userRepository.save(user);
    return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}

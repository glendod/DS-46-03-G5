/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
import java.util.List;

public class User {
    private String userID;
    private String phone;
    private String email;
    private String name;
    private String password;

    public User(String userID, String phone, String email, String name, String password) {
        this.userID = userID;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    // Getter dan Setter
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setPassword(String password) { this.password = password; }

    // Methods
    public Booking createBooking(User user, List<Seat> seats, Shuttle shuttle) {
        return new Booking("B001", user, shuttle, seats, "2024-12-04", "10:00", 100.0);
    }

    public void viewBookHistory() {
        System.out.println("Menampilkan Riwayat Booking");
    }
}


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

public class Booking {
    private String bookingID;
    private User user;
    private Shuttle shuttle;
    private List<Seat> seats;
    private String date;
    private String time;
    private double totalPrice;

    public Booking(String bookingID, User user, Shuttle shuttle, List<Seat> seats, String date, String time, double totalPrice) {
        this.bookingID = bookingID;
        this.user = user;
        this.shuttle = shuttle;
        this.seats = seats;
        this.date = date;
        this.time = time;
        this.totalPrice = totalPrice;
    }

    public double calculateTotalPrice() {
        return seats.stream().mapToDouble(Seat::getPrice).sum();
    }

    public void cancelBooking() {
        System.out.println("Booking " + bookingID + " Telah di cancel.");
    }
}


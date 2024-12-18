/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
public class Seat {
    private int seatNumber;
    private boolean availability;
    private double price;

    public Seat(int seatNumber, boolean availability, double price) {
        this.seatNumber = seatNumber;
        this.availability = availability;
        this.price = price;
    }

    public boolean reserve() {
        if (availability) {
            availability = false;
            System.out.println("Seat " + seatNumber + " reserved.");
            return true;
        }
        System.out.println("Seat " + seatNumber + " is already reserved.");
        return false;
    }

    public boolean cancelReservation() {
        if (!availability) {
            availability = true;
            System.out.println("Seat " + seatNumber + " reservation canceled.");
            return true;
        }
        System.out.println("Seat " + seatNumber + " is already available.");
        return false;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }
}


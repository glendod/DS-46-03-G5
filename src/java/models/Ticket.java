/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
public class Ticket {
    private int ticketID;
    private String status;
    private Booking booking;
    private Seat seat;

    public Ticket(int ticketID, String status, Booking booking, Seat seat) {
        this.ticketID = ticketID;
        this.status = status;
        this.booking = booking;
        this.seat = seat;
    }

    public boolean generateTicket() {
        System.out.println("Generating ticket for Booking ID: " + booking);
        return true;
    }

    public boolean validateTicket() {
        if ("valid".equalsIgnoreCase(status)) {
            System.out.println("Ticket " + ticketID + " valid.");
            return true;
        }
        System.out.println("Ticket " + ticketID + " invalid.");
        return false;
    }

    public void cancelTicket() {
        status = "cancelled";
        System.out.println("Ticket " + ticketID + " Telah Di cancel.");
    }
}


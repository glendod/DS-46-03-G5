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

public class Shuttle {
    private int shuttleID;
    private String shuttleName;
    private int capacity;
    private Route route;
    private List<Schedule> schedule;

    public Shuttle(int shuttleID, String shuttleName, int capacity, Route route, List<Schedule> schedule) {
        this.shuttleID = shuttleID;
        this.shuttleName = shuttleName;
        this.capacity = capacity;
        this.route = route;
        this.schedule = schedule;
    }

    public List<Seat> getAvailableSeats() {
        System.out.println("Fetching available seats...");
        return null; // Return actual seat list in implementation
    }
}


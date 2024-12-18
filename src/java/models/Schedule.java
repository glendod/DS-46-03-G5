/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
public class Schedule {
    private int scheduleID;
    private String date;
    private Driver driver;
    private Shuttle shuttle;
    private String departureTime;
    private String arrivalTime;

    public Schedule(int scheduleID, String date, Driver driver, Shuttle shuttle, String departureTime, String arrivalTime) {
        this.scheduleID = scheduleID;
        this.date = date;
        this.driver = driver;
        this.shuttle = shuttle;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getScheduleDetails() {
        return "Schedule ID: " + scheduleID + ", Tanggal: " + date + ", Departure: " + departureTime + ", Arrival: " + arrivalTime;
    }

    public void changeStatus(String newStatus) {
        System.out.println("Mengganti Tanggal Menjadi: " + newStatus);
    }
}


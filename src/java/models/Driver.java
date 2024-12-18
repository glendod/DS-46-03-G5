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

public class Driver {
    private int driverID;
    private String name;
    private String status;
    private List<Schedule> schedules;

    public Driver(int driverID, String name, String status, List<Schedule> schedules) {
        this.driverID = driverID;
        this.name = name;
        this.status = status;
        this.schedules = schedules;
    }

    public void updateSchedule(Schedule schedule) {
        System.out.println("Updating schedule for driver: " + name);
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Driver " + name + "'s status changed to: " + newStatus);
    }
}


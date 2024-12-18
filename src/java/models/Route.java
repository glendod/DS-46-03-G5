/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
public class Route {
    private int routeID;
    private String origin;
    private String destination;
    private double distance;

    public Route(int routeID, String origin, String destination, double distance) {
        this.routeID = routeID;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    public int calculateETA() {
        return (int) (distance / 60); // Assuming 60 km/h speed
    }
}


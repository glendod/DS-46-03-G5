/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author dugong
 */
public class Payment {
    private int paymentID;
    private double amount;
    private String status;
    private String method;
    private Booking booking;

    public Payment(int paymentID, double amount, String status, String method, Booking booking) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.booking = booking;
    }

    public boolean processPayment() {
        if ("pending".equalsIgnoreCase(status)) {
            status = "completed";
            System.out.println("Pembayaran dengan jumlah $" + amount + " Berhasil.");
            return true;
        }
        System.out.println("Pembayaran telah di Proses.");
        return false;
    }

    public boolean refundPayment() {
        if ("completed".equalsIgnoreCase(status)) {
            status = "refunded";
            System.out.println("Pembayaran Berhasil di Refund.");
            return true;
        }
        System.out.println("Refund gagal.");
        return false;
    }

    public String getPaymentStatus() {
        return status;
    }
}


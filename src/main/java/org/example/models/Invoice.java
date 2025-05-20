package org.example.models;

import java.util.Date;

public class Invoice {
    private int invoiceId;
    private Date exitTime;
    private Ticket ticket;
    private Payment payment;
    private Gate exitGate;
    private ParkingAttendant parkingAttendant;
}

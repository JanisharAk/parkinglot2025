package org.example.services;

import org.example.exception.NoParkingSpotsAvailableException;
import org.example.models.Gate;
import org.example.models.ParkingSpot;
import org.example.models.Ticket;
import org.example.models.Vehicle;

public class EntryGateService {
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    TicketService ticketService = new TicketService();


    public Ticket createTicket(Gate gate, Vehicle vehicle)
            throws NoParkingSpotsAvailableException {

        // Step 1: Find an available spot for the vehicle.
        ParkingSpot availableParkingSpot =
                slotAllocationService.findSpot(vehicle.getVehicleType());

        if (availableParkingSpot == null) {
            throw new NoParkingSpotsAvailableException();
        }

        Ticket ticket = ticketService.createTicket(vehicle, availableParkingSpot, gate);
        slotAllocationService.allocateSpot(availableParkingSpot);

        return ticket;
    }
}
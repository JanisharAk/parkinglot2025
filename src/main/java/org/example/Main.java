package org.example;

import org.example.controllers.TicketController;
import org.example.dto.GenerateTicketRequest;
import org.example.dto.GenerateTicketResponse;
import org.example.exception.NoParkingSpotsAvailableException;
import org.example.models.*;
import org.example.services.EntryGateService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = Vehicle.builder().vehicleType(VehicleType.CAR).regNumber("2322").build();
        Vehicle car = Vehicle.builder().vehicleType(VehicleType.CAR).regNumber("2322").build();


        ParkingAttendant pa = ParkingAttendant.builder().email("abc@gmail.com").name("abc").build();
        Gate entryGate = Gate.builder()
                .gateNumber(1)
                .parkingAttendant(pa)
                .build();

        ParkingLot parkingLot = ParkingLot.builder()
                .entryGates(List.of(entryGate))
                .address("Some random address")
                .name("Random name")
                .build();

        EntryGateService entryGateService = new EntryGateService();

        TicketController controller = new TicketController(entryGateService);

        try {
            GenerateTicketResponse response = controller.generateTicket(
                    GenerateTicketRequest.builder().vehicle(car).gate(entryGate).build());
            System.out.println(response.getTicket());
        } catch (NoParkingSpotsAvailableException e) {
            throw new RuntimeException(e);
        }

    }
}
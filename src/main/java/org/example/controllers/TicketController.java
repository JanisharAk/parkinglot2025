package org.example.controllers;


import org.example.dto.GenerateTicketRequest;
import org.example.dto.GenerateTicketResponse;

public class TicketController {
    public GenerateTicketResponse generateTicket(GenerateTicketRequest request) {
        return new GenerateTicketResponse();
    }
}

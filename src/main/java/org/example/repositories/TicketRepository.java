package org.example.repositories;


import org.example.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public void save(Ticket ticket) {
        tickets.add(ticket);
    }
}
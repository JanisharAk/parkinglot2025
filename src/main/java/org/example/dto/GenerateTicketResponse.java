package org.example.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.models.Ticket;

@Setter
@Getter
@Builder
public class GenerateTicketResponse {
    Ticket ticket;
}

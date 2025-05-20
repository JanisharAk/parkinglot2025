package org.example.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.models.Gate;
import org.example.models.Vehicle;

@Getter
@Setter
@Builder
public class GenerateTicketRequest {
    private Vehicle vehicle;
    private Gate gate;
}

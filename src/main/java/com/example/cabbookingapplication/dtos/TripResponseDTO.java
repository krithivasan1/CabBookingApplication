package com.example.cabbookingapplication.dtos;

import com.example.cabbookingapplication.models.Taxi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripResponseDTO {
    public Taxi taxi;
    public String source;
    public String destination;
    public double amount;
}

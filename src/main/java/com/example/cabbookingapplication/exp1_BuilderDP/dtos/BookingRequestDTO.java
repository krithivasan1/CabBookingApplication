package com.example.cabbookingapplication.exp1_BuilderDP.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequestDTO {
    public String source;
    public String destination;
    public String cabType;
    public String specialInstructions;
}

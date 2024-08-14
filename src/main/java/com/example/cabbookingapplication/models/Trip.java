package com.example.cabbookingapplication.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    public Taxi taxi;
    public String source;
    public String destination ;
    public double amount;
}

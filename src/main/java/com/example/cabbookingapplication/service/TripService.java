package com.example.cabbookingapplication.service;

import com.example.cabbookingapplication.models.Taxi;
import com.example.cabbookingapplication.models.TaxiStatus;
import com.example.cabbookingapplication.models.Trip;

public interface TripService {

    public Trip bookCab(String source, String destination);
    public double calculateServiceproviderFees(double distance);



    }

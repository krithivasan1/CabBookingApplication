package com.example.cabbookingapplication.service;


import com.example.cabbookingapplication.models.LocationDistance;
import com.example.cabbookingapplication.models.Taxi;
import com.example.cabbookingapplication.models.TaxiStatus;
import com.example.cabbookingapplication.models.Trip;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.xml.stream.Location;
import java.util.List;
import java.util.Optional;

@Service("UberTripService")
public class UberTripService implements TripService {
    @Override
    public Trip bookCab(String source, String destination) {
        List<Taxi> listTaxi = Taxi.getCurrentTaxis();
        Trip trip=null;
        double distance = 0.0D;
        Optional<Taxi> availableTaxiOptional = listTaxi.stream().filter(a -> a.getTaxiStatus().equals(TaxiStatus.FREE)).findFirst();
        List<LocationDistance> locationDistanceList=LocationDistance.initializeLocationDistance();
        Optional<LocationDistance> locationDistanceOptional = locationDistanceList.stream().filter(a-> a.getSource().equals(source) && a.getDestination().equals(destination)
        || a.getSource().equals(destination) || a.getDestination().equals(source)).findFirst();
        if(!locationDistanceOptional.isEmpty()){
            distance = locationDistanceOptional.get().getDistance();
        }
        double amount =  calculateServiceproviderFees(distance);
       if(!availableTaxiOptional.isEmpty()){
           Taxi taxi = availableTaxiOptional.get();
           taxi.setTaxiStatus(TaxiStatus.BOOKED);
           Taxi.updateTaxi(taxi);
           trip = new Trip(taxi,source,destination,amount);
       }
       return trip ;
    }

    @Override
    public double calculateServiceproviderFees(double distance){
        double amount = 100 ;
        if(distance>5){
            double remainingAmount = (distance-5)*20; // THis is uber specific calculation
            amount = amount +remainingAmount;

        }
        return amount;

    }
}

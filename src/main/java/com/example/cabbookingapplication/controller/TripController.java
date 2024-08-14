package com.example.cabbookingapplication.controller;


import com.example.cabbookingapplication.dtos.TripResponseDTO;
import com.example.cabbookingapplication.models.Trip;
import com.example.cabbookingapplication.service.TripService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cabbookingapplication.dtos.TripRequestDTO;

@RestController
public class TripController {
    TripService tripService;

    public TripController(@Qualifier("UberTripService") TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping("/booktaxi")
    public TripResponseDTO bookTaxi(@RequestBody TripRequestDTO tripRequestDTO) {

        String sourceLocation = tripRequestDTO.getSource();
        String destinationLocation = tripRequestDTO.getDestination();
        Trip trip = tripService.bookCab(sourceLocation, destinationLocation);
        TripResponseDTO tripResponseDTO = new TripResponseDTO(trip.getTaxi(), trip.getSource(), trip.getDestination(), trip.getAmount());
        return tripResponseDTO;


    }
}

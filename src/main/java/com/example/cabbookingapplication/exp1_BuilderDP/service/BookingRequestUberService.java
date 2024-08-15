package com.example.cabbookingapplication.exp1_BuilderDP.service;

import com.example.cabbookingapplication.exp1_BuilderDP.models.BookingRequest;
import org.springframework.stereotype.Service;


@Service("BookingRequestUberService")
public class BookingRequestUberService implements BookingRequestService {
    @Override
    public BookingRequest bookCab(BookingRequest bookingRequest) {
        // get the distance - random between 5 and 20
        // calculate the amount
        // Return the object by having those values.
        int min = 5;
        int max = 10;
        double distance = Math.random() * (max - min + 1) + min;
        double amount = 100 + (distance - 5) * 5;
        BookingRequest bookingRequest1 = BookingRequest.getBuilder().setAmount(amount).setDistance(distance).setSource(bookingRequest.source).setDestination((bookingRequest.destination)).setSpecialInstructions(bookingRequest.specialInstructions).
        build();
        return bookingRequest1;
    }
}

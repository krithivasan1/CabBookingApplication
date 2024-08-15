package com.example.cabbookingapplication.exp1_BuilderDP.controllers;


import com.example.cabbookingapplication.exp1_BuilderDP.dtos.BookingRequestDTO;
import com.example.cabbookingapplication.exp1_BuilderDP.models.BookingRequest;
import com.example.cabbookingapplication.exp1_BuilderDP.service.BookingRequestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp1")
public class BookingRequestController {

BookingRequestService bookingRequestService;
public BookingRequestController(@Qualifier("BookingRequestUberService")BookingRequestService bookingRequestService){
    this.bookingRequestService=bookingRequestService;
}
    @PostMapping("/bookcab")
    public BookingRequest bookCab(@RequestBody BookingRequestDTO bookingRequestDTO) {
        BookingRequest bookingRequest = BookingRequest.getBuilder().setSource(bookingRequestDTO.getSource()).setDestination(bookingRequestDTO.getDestination()).setCabType(bookingRequestDTO.getCabType()).setSpecialInstructions(bookingRequestDTO.getSpecialInstructions()).build();
        return bookingRequestService.bookCab(bookingRequest);
    }

}

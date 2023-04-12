package com.UST.Flightservices.controller;

import com.UST.Flightservices.dto.BookRequest;
import com.UST.Flightservices.dto.FlightBookAcknowledgement;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.sevice.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightServiceController {
    @Autowired
    private FlightBookingService flightBookingService;
    @PostMapping("/booking")
    public FlightBookAcknowledgement bookingFlightTicket(@RequestBody BookRequest request) throws InsufficientAmountException {

        return flightBookingService.bookingFlightTicket(request);
    }
}

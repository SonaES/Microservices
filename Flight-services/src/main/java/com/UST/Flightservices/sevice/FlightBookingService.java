package com.UST.Flightservices.sevice;

import com.UST.Flightservices.dto.BookRequest;
import com.UST.Flightservices.dto.FlightBookAcknowledgement;
import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.Paymentinfo;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.repository.Passengerrepo;
import com.UST.Flightservices.repository.Paymentrepo;
import com.UST.Flightservices.util.PaymentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private Passengerrepo passengerrepo;

    @Autowired
    private Paymentrepo paymentrepo;
    public FlightBookAcknowledgement bookingFlightTicket(BookRequest request) throws InsufficientAmountException {
        Passengerinfo passengerinfo =request.getPassengerinfo();
        passengerinfo=passengerrepo.save(passengerinfo);
        Paymentinfo paymentinfo=request.getPaymentinfo();
        PaymentUtil.validateCreditLimit(paymentinfo.getAccountNo(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPId());
        paymentinfo.setAmount(passengerinfo.getFare());
        paymentrepo.save(paymentinfo);
        return new FlightBookAcknowledgement("success",passengerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerinfo);

    }
}
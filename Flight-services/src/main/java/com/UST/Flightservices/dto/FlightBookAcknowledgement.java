package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightBookAcknowledgement {
    private String status;
    private double amount;
    private String pnrno;
    private Passengerinfo passengerinfo;
}

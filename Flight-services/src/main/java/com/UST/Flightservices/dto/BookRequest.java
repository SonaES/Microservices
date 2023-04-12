package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import com.UST.Flightservices.entity.Paymentinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookRequest {
    private Passengerinfo passengerinfo;
    private Paymentinfo paymentinfo;
}

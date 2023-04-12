package com.UST.Flightservices.util;

import com.UST.Flightservices.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtil {

    private static Map<String, Double> paymentmap = new HashMap<>();

    static {
        paymentmap.put("acc1", 2000.00);
        paymentmap.put("acc2", 1500.00);
        paymentmap.put("acc3", 2500.00);
        paymentmap.put("acc4", 400.00);
        paymentmap.put("acc5", 45600.00);
        paymentmap.put("acc6", 90000.00);
        paymentmap.put("acc7", 200.00);
        paymentmap.put("acc8", 3600.00);
    }

    public static boolean validateCreditLimit(String accountNo, double paidamount) throws InsufficientAmountException {

        if (paidamount > paymentmap.get(accountNo)) {
            throw new InsufficientAmountException("insufficient amount...");
        } else {
            return true;
        }

    }

}

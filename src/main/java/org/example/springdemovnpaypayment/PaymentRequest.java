package org.example.springdemovnpaypayment;

import lombok.Data;

@Data
public class PaymentRequest {
    private long amount;
    private String orderInfo;
}
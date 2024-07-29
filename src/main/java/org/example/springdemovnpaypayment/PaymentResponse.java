package org.example.springdemovnpaypayment;

import lombok.Data;

@Data
public class PaymentResponse {
    private boolean success;
    private String message;
}
package com.sweethome.microservice.booking.exception;

public class InvalidPaymentMethodException extends Throwable {
    public InvalidPaymentMethodException(String message) {
        super(message);
    }
}
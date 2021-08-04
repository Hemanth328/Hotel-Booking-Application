package com.sweethome.microservice.booking.exception;

public class BookingIdNotFoundException extends Throwable {
    public BookingIdNotFoundException(String message) {
        super(message);
    }
}
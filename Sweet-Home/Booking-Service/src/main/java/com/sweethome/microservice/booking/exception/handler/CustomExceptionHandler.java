package com.sweethome.microservice.booking.exception.handler;

import com.sweethome.microservice.booking.DTO.ErrorResponseDTO;
import com.sweethome.microservice.booking.exception.BookingIdNotFoundException;
import com.sweethome.microservice.booking.exception.InvalidPaymentMethodException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidPaymentMethodException.class)
    public ResponseEntity<ErrorResponseDTO> invalidPaymentTypeException(){
        ErrorResponseDTO response = new ErrorResponseDTO("Invalid mode of payment", HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BookingIdNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> bookingIdNotFoundException(){

        ErrorResponseDTO response = new ErrorResponseDTO("Invalid Booking Id",HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }
}

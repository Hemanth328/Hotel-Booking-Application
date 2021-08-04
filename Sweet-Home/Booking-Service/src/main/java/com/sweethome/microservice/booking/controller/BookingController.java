package com.sweethome.microservice.booking.controller;

import com.sweethome.microservice.booking.DTO.BookingInfoEntityDTO;
import com.sweethome.microservice.booking.DTO.TransactionDetailsEntityDTO;
import com.sweethome.microservice.booking.entities.BookingInfoEntity;
import com.sweethome.microservice.booking.exception.BookingIdNotFoundException;
import com.sweethome.microservice.booking.exception.InvalidPaymentMethodException;
import com.sweethome.microservice.booking.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel/")
public class BookingController {

    BookingService bookingService;
    ModelMapper modelMapper;

    @Autowired
    public BookingController(BookingService bookingService,ModelMapper modelMapper){
        this.bookingService=bookingService;
        this.modelMapper=modelMapper;
    }

    @PostMapping("/booking")
    public ResponseEntity<BookingInfoEntityDTO> book(@RequestBody BookingInfoEntityDTO bookingInfoEntityDto){

        BookingInfoEntity bookingInfoEntity = modelMapper.map(bookingInfoEntityDto,BookingInfoEntity.class);
        BookingInfoEntity savedBookingEntity=bookingService.book(bookingInfoEntity);
        BookingInfoEntityDTO savedBookingEntityDto=modelMapper.map(savedBookingEntity, BookingInfoEntityDTO.class);

        return new ResponseEntity(savedBookingEntityDto, HttpStatus.CREATED);
    }


    @PostMapping("/booking/{id}/transaction")
    public ResponseEntity<BookingInfoEntityDTO> transaction(@PathVariable("id") int id, @RequestBody TransactionDetailsEntityDTO transactionDetailsEntityDto) throws InvalidPaymentMethodException, BookingIdNotFoundException {

       BookingInfoEntity bookingInfoEntity= bookingService.makeTransaction(transactionDetailsEntityDto,id);
       BookingInfoEntityDTO bookingInfoEntityDto=modelMapper.map(bookingInfoEntity, BookingInfoEntityDTO.class);
        return new ResponseEntity(bookingInfoEntityDto,HttpStatus.CREATED);
    }

}

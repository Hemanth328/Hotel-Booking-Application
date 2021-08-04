package com.sweethome.microservice.booking.service;

import com.sweethome.microservice.booking.DTO.TransactionDetailsEntityDTO;
import com.sweethome.microservice.booking.entities.BookingInfoEntity;
import com.sweethome.microservice.booking.exception.BookingIdNotFoundException;
import com.sweethome.microservice.booking.exception.InvalidPaymentMethodException;

import java.util.List;


public interface BookingService {

   public BookingInfoEntity book(BookingInfoEntity bookingInfoEntity);
   public BookingInfoEntity getBookingBasedOnId(int id);
   public List<BookingInfoEntity> getAllBookings();
   public void deleteBookingID(BookingInfoEntity bookingInfoEntity);
   public BookingInfoEntity updateBooking(BookingInfoEntity bookingInfoEntity);
   public BookingInfoEntity makeTransaction(TransactionDetailsEntityDTO transactionDetailsEntityDto, int id) throws InvalidPaymentMethodException, BookingIdNotFoundException;

}

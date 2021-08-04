package com.sweethome.microservice.booking.DAO;

import com.sweethome.microservice.booking.entities.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingInfoEntityDAO extends JpaRepository<BookingInfoEntity,Integer> {
    public Boolean existsByBookingId(int id);
}

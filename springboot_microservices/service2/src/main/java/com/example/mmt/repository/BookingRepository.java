package com.example.mmt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mmt.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository <Booking,String> {
}

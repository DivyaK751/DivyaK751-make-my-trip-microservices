package com.example.mmt.service;

import com.example.mmt.model.Booking;
import com.example.mmt.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBooking(String b) {
        return bookingRepository.findById(b).orElse(null);
    }


    public Booking createBooking(Booking b) {
        return bookingRepository.save(b);
    }

    public void deleteBooking(String id) {
        bookingRepository.deleteById(id);
    }

    public Booking updateBooking(Booking p, String id) {
        Booking ba = bookingRepository.findById(id).get();
        ba.setPassenger(p.getPassenger());
        ba.setFlights(p.getFlights());

        bookingRepository.save(ba);
        return ba;
    }

    public void deleteAllBookings() {
        bookingRepository.deleteAll();
    }
}

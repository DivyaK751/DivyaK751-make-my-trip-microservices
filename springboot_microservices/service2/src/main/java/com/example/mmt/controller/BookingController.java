package com.example.mmt.controller;
import com.example.mmt.model.Booking;
import com.example.mmt.service.BookingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/getAllBookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/getBooking/{id}")
    public Booking getBooking(@PathVariable String id) {
        return bookingService.getBooking(id);
    }

    @PostMapping("/createBooking")
    public Booking createBooking(@RequestBody Booking b) {
        return bookingService.createBooking(b);
    }

    @DeleteMapping("/deleteBooking/{id}")
    public String deleteBooking(@PathVariable String id) {
        bookingService.deleteBooking(id);
        return "Booking Deleted";
    }

    @PutMapping("/updateBooking/{id}")
    public Booking updatePassenger(@RequestBody Booking p, @PathVariable String id) {
        return bookingService.updateBooking(p, id);
    }

    @DeleteMapping("/deleteAllBookings")
    public String deletePassengers() {
        bookingService.deleteAllBookings();
        return "All Booking data deleted";
    }

}

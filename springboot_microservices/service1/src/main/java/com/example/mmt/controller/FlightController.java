package com.example.mmt.controller;
import com.example.mmt.model.Flight;
import com.example.mmt.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/getAllFlights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/getFlight/{AirportID}")
    public Flight getFlight(@PathVariable String id) {
        return flightService.getFlight(id);
    }

    @PostMapping("/createFlight")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @DeleteMapping("/deleteFlight/{FlightId}")
    public String deleteFlight(@PathVariable String FlightId) {
        flightService.deleteFlight(FlightId);
        return "Airport Deleted";
    }

    @PutMapping("/updateFlight/{AirportId}")
    public Flight updateFlight(@RequestBody Flight flight, @PathVariable String id) {
        return flightService.updateFlight(flight, id);
    }

    @DeleteMapping("/deleteAllFlights")
    public String deleteAllFlights() {
        flightService.deleteAllFlights();
        return "All airport data deleted";
    }

}

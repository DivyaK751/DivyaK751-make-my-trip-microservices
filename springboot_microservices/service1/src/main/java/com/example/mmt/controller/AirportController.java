package com.example.mmt.controller;
import com.example.mmt.model.Airport;
import com.example.mmt.service.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {
    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/getAllAirports")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/get/{AirportID}")
    public Airport getAirport(@PathVariable String AirportID) {
        return airportService.getAirport(AirportID);
    }

    @PostMapping("/createAirport")
    public Airport createAirport(@RequestBody Airport Airport) {
        return airportService.create(Airport);
    }

    @DeleteMapping("/deleteAirport/{AirportId}")
    public String deleteAirport(@PathVariable String AirportId) {
        airportService.delete(AirportId);
        return "Airport Deleted";
    }

    @PutMapping("/updateAirport/{AirportId}")
    public Airport updateAirport(@RequestBody Airport Airport, @PathVariable String AirportId) {
        return airportService.update(Airport, AirportId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAirports() {
        airportService.deleteAll();
        return "All airport data deleted";
    }
    
}

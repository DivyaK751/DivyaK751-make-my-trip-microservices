package com.example.mmt.service;
import com.example.mmt.model.Flight;
import com.example.mmt.repository.FlightRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlight(String airportId) {
        return flightRepository.findById(airportId).orElse(null);
    }


    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlight(String airportId) {
        flightRepository.deleteById(airportId);
    }

    public Flight updateFlight(Flight flight, String id) {
        Flight f = flightRepository.findById(id).get();
        f.setDeparture(flight.getDeparture());
        f.setArrival(flight.getArrival());
        f.setDepartureDate(flight.getDepartureDate());
        f.setArrivalDate(flight.getArrivalDate());

        flightRepository.save(f);
        return f;
    }

    public void deleteAllFlights() {
        flightRepository.deleteAll();
    }
}

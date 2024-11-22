package com.example.mmt.service;
import com.example.mmt.model.Airport;
import com.example.mmt.repository.AirportRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirportService {

    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirport(String airportId) {
        return airportRepository.findById(airportId).orElse(null);
    }


    public Airport create(Airport airport) {
        return airportRepository.save(airport);
    }

    public void delete(String airportId) {
        airportRepository.deleteById(airportId);
    }

    public Airport update(Airport airport, String iatacode) {
        Airport ai = airportRepository.findById(iatacode).get();
        ai.setName(airport.getName());
        ai.setCountryIsoCode(airport.getCountryIsoCode());
        airportRepository.save(ai);
        return ai;
    }

    public void deleteAll() {
        airportRepository.deleteAll();
    }

}



package com.example.mmt.service;

import com.example.mmt.model.Passenger;
import com.example.mmt.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger getPassenger(String p) {
        return passengerRepository.findById(p).orElse(null);
    }


    public Passenger createPassenger(Passenger p) {
        return passengerRepository.save(p);
    }

    public void deletePassenger(String id) {
        passengerRepository.deleteById(id);
    }

    public Passenger updatePassenger(Passenger p, String id) {
        Passenger pa = passengerRepository.findById(id).get();
        pa.setFirstName(p.getFirstName());
        pa.setLastName(p.getLastName());
        pa.setEmail(p.getEmail());

        passengerRepository.save(pa);
        return pa;
    }

    public void deleteAllPassengers() {
        passengerRepository.deleteAll();
    }

}

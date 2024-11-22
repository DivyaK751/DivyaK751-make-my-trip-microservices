package com.example.mmt.controller;
import com.example.mmt.model.Passenger;
import com.example.mmt.service.PassengerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PassengerController {
    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/getAllPassengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/getPassenger/{id}")
    public Passenger getPassenger(@PathVariable String id) {
        return passengerService.getPassenger(id);
    }

    @PostMapping("/createPassenger")
    public Passenger createPassenger(@RequestBody Passenger p) {
        return passengerService.createPassenger(p);
    }

    @DeleteMapping("/deletePassenger/{id}")
    public String deletePassenger(@PathVariable String id) {
        passengerService.deletePassenger(id);
        return "Passenger Deleted";
    }

    @PutMapping("/updatePassenger/{id}")
    public Passenger updatePassenger(@RequestBody Passenger p, @PathVariable String id) {
        return passengerService.updatePassenger(p, id);
    }

    @DeleteMapping("/deleteAllPassengers")
    public String deletePassengers() {
        passengerService.deleteAllPassengers();
        return "All Passenger data deleted";
    }


}

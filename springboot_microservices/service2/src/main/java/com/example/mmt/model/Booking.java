package com.example.mmt.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Booking {
    @Id
    private String id;

    @Column
    private String passenger;

    @Column
    private String flights;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getFlights() {
        return flights;
    }

    public void setFlights(String flights) {
        this.flights = flights;
    }


}

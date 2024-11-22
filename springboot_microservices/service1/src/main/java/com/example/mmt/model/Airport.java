package com.example.mmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table
public class Airport {

    @Id
    private String iataCode;
    @Column
    private String name;
    @Column
    private String countryIsoCode;

    public Airport() {

    }

    public Airport(String iataCode, String name, String countryIsoCode) {

        this.iataCode = iataCode;
        this.name = name;
        this.countryIsoCode = countryIsoCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

}
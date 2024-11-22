package com.example.mmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mmt.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String>{
}

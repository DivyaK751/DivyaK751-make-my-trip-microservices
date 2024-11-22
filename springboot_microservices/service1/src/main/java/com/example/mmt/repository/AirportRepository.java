package com.example.mmt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mmt.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String>{
}

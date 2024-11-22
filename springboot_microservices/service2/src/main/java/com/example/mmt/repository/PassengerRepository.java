package com.example.mmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mmt.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String>{
}

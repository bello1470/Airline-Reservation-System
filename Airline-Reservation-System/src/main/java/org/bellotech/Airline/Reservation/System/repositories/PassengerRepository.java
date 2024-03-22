package org.bellotech.Airline.Reservation.System.repositories;

import org.bellotech.Airline.Reservation.System.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    Optional<Passenger> findByEmail(String email);

    List<Passenger> findByName(String name);
}

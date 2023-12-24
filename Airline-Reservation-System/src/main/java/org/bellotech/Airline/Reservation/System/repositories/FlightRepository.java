package org.bellotech.Airline.Reservation.System.repositories;

import org.bellotech.Airline.Reservation.System.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight , Long> {


}

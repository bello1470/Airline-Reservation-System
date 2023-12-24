package org.bellotech.Airline.Reservation.System.repositories;

import org.bellotech.Airline.Reservation.System.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlightRepository extends JpaRepository<Flight , Long> {

    @Query(value = "SELECT * FROM flight WHERE departure_airport = ?1 AND arrival_airport = ?2",
            nativeQuery = true)
    List<Flight> searchFlightByarrivalAndDeparture(String arrivalAirport, String departureAirport);


}

package org.bellotech.Airline.Reservation.System.repositories;

import org.bellotech.Airline.Reservation.System.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface FlightRepository extends JpaRepository<Flight , Long> {

    @Query(value = "SELECT * FROM flight WHERE arrival_airport = ?1 AND departure_airport = ?2",
            nativeQuery = true)
    List<Flight> searchFlightArrivalAndDeparture(String arrivalAirport, String departureAirport);

}

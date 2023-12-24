package org.bellotech.Airline.Reservation.System.repositories;

import org.bellotech.Airline.Reservation.System.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}

package org.bellotech.Airline.Reservation.System.repositories;


import org.bellotech.Airline.Reservation.System.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}

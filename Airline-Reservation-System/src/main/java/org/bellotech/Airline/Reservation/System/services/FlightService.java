package org.bellotech.Airline.Reservation.System.services;


import org.bellotech.Airline.Reservation.System.models.Flight;
import org.bellotech.Airline.Reservation.System.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightService {


   @Autowired
  private FlightRepository flightRepository;

   public Flight save(Flight flight){

     return flightRepository.save(flight);
   }

 public List<Flight> searchFlightByarrivalAndDeparture(String arrivalAirport, String departureAirport){

       return  flightRepository.searchFlightByarrivalAndDeparture(arrivalAirport,departureAirport);
 }

}

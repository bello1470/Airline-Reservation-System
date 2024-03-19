package org.bellotech.Airline.Reservation.System.services;


import lombok.AllArgsConstructor;
import org.bellotech.Airline.Reservation.System.models.Flight;
import org.bellotech.Airline.Reservation.System.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class FlightService {



  private final FlightRepository flightRepository;

   public Flight save(Flight flight){

     return flightRepository.save(flight);
   }

 public List<Flight> searchFlightArrivalAndDeparture(String arrivalAirport, String departureAirport) {


       return flightRepository.searchFlightArrivalAndDeparture(arrivalAirport,departureAirport);
 }

 public List<Flight> getAllFlight( ){

       return flightRepository.findAll();
 }

 public Optional<Flight> getFlightById(Long flightId){

return flightRepository.findById(flightId);
 }

}

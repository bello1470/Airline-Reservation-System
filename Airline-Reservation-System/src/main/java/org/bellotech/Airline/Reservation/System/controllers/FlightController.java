package org.bellotech.Airline.Reservation.System.controllers;

import org.bellotech.Airline.Reservation.System.models.Flight;

import org.bellotech.Airline.Reservation.System.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {

    @Autowired
    private  FlightService flightService;

    @PostMapping("/flight")
   public Flight saveFlight(@RequestBody Flight flight){


       return flightService.save(flight);
   }

   @GetMapping("/search")
   public List<Flight> searchFlight(@RequestParam String arrivalAirport,
                                   @RequestParam String departureAirport){


        return flightService.searchFlightArrivalAndDeparture(arrivalAirport,departureAirport);
   }

   @GetMapping("/flightId/{id}")
public Optional<Flight> getFlightById(
        @PathVariable("id") Long flightId){


        return flightService.getFlightById(flightId);
   }

}

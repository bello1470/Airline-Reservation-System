package org.bellotech.Airline.Reservation.System.controllers;

import org.bellotech.Airline.Reservation.System.models.Flight;
import org.bellotech.Airline.Reservation.System.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {

    @Autowired
    private  FlightService flightService;



    // Endpoint for saving flight to db.
    @PostMapping("/flight")
   public Flight saveFlight(@RequestBody Flight flight){


       return flightService.save(flight);
   }

   //Endpoint for searching flight using airports names.
    @GetMapping("/search")
    public ResponseEntity<?> searchFlight(
            @RequestParam String arrivalAirport,
            @RequestParam String departureAirport) {

        List<Flight> flights = flightService.searchFlightArrivalAndDeparture(arrivalAirport, departureAirport);
        if (flights.isEmpty()) {
            return new ResponseEntity<>("No flights found for the given criteria.", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(flights, HttpStatus.OK);
        }
    }



    //Endpoint to show all available flight
    @GetMapping("/flight")
    public ResponseEntity<?> getAllFlights() {
        List<Flight> flights = flightService.getAllFlight();

        if (flights.isEmpty()) {
            return new ResponseEntity<>("No flights found.", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(flights, HttpStatus.OK);
        }
    }

    // Endpoint that look for flight with flight Id.
   @GetMapping("/flight/{flightId}")
public ResponseEntity<?> getFlightById(@PathVariable Long flightId){

        Optional<Flight> flightOptional = flightService.getFlightById(flightId);

        if (flightOptional.isPresent()){

            Flight flight = flightOptional.get();


            return new ResponseEntity<>(flight.getSeatAvailable() > 0, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("flight Not found ", HttpStatus.NOT_FOUND);
        }



   }

}

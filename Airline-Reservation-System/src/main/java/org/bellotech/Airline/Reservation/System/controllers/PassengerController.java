package org.bellotech.Airline.Reservation.System.controllers;


import org.bellotech.Airline.Reservation.System.models.Passenger;
import org.bellotech.Airline.Reservation.System.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;


    @GetMapping("/savePassenger")
    public Passenger savePassengerDetails(@RequestBody Passenger passenger){


    return passengerService.savePassenger(passenger);
    }

    @GetMapping("/getAllPassengers")
    public ResponseEntity<?> getAllPassengers(){

        List<Passenger> passengerObject = passengerService.getAllPassengers();
        if (passengerObject.isEmpty()){

            return new ResponseEntity<>("No passenger yet ",HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(passengerObject,HttpStatus.OK);
    }
}

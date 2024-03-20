package org.bellotech.Airline.Reservation.System.services;


import lombok.AllArgsConstructor;
import org.bellotech.Airline.Reservation.System.models.Passenger;
import org.bellotech.Airline.Reservation.System.repositories.PassengerRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PassengerService {


    private final PassengerRepository passengerRepository;

    public Passenger savePassenger (@NotNull Passenger passenger){

        if (passengerRepository.findByEmail(passenger.getEmail()).isPresent()){

            throw new IllegalArgumentException("Email Already Existed, Use another Email");
        }

        return passengerRepository.save(passenger);
    }

    public List<Passenger> getAllPassengers(){

        return passengerRepository.findAll();
    }

    public Optional<Passenger> getPassengerByEmail(String email){

        return passengerRepository.findByEmail(email);
    }

    public Optional<Passenger> getPassengerById(Long passengerId){

        return passengerRepository.findById(passengerId);
    }

    public List<Passenger> getPassengerByName(String name){

        return passengerRepository.findByName(name);
    }

}

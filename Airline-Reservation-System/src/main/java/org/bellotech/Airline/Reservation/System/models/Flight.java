package org.bellotech.Airline.Reservation.System.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
@Getter
@Setter
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy  = GenerationType.SEQUENCE)
    private Long flightId;
    @Column(name = "flight_number")
    private Long flightNumber;
    @Column(name = "departure_airport")
    private String departureAirport;
    @Column(name = "arrival_airport")
    private String arrivalAirport;
    @Column(name = "departure_time")
    private LocalDateTime departureTime;
    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;
    @Column(name = "price")
    private double price;
    @Column(name = "seat_available")
    private int seatAvailable;


}

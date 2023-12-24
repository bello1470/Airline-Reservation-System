package org.bellotech.Airline.Reservation.System.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bellotech.Airline.Reservation.System.utils.BookingStatus;

import java.util.Date;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
private  Flight flight;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
private  Passenger passenger;

    @Column(name = "booking_date")
private Date bookingDate;

    @Column(name = "booking_status")
@Enumerated(EnumType.STRING)
private BookingStatus bookingStatus;

    @Column(name = "payment_details")
private String paymentDetails;


}

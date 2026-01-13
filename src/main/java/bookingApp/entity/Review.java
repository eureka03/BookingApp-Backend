package bookingApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Review {

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    @Column(name="rating")
    private String reviewText;

    @Column(name="date")
    private LocalDate date;


}

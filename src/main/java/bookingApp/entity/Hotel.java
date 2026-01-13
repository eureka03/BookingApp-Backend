package bookingApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {

    @Id
    private Integer Id;

    @Column(name="hotel_name")
    private String hotelName;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="column")
    private String country;

    @Column(name="rating")
    private Double rating;

    @Column(name="number_of_rooms")
    private Integer numberOfRooms;


}

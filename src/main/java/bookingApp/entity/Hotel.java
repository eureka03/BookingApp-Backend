package bookingApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hotel_id")
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
    @OneToMany(mappedBy="hotel")
    private Integer numberOfRooms;


}

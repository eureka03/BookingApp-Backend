package bookingApp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="rooms")
public class Room {

    @ManyToOne
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_id")
    private Integer roomNumber;

    @Column(name="room_type")
    private String roomType;

    @Column(name="price_per_night")
    private Double pricePerNight;

    @Column(name="capacity")
    private Integer capacity;

    @Column(name="availability_status")
    private String availabilityStatus;




}

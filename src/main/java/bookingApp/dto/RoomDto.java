package bookingApp.dto;

import lombok.Data;

@Data
public class RoomDto {
    private Integer hotelId;
    private Integer roomNumber;
    private String roomType;
    private Double pricePerNight;
    private Integer capacity;
    private String availabilityStatus;
}

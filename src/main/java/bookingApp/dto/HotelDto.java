package bookingApp.dto;

import lombok.Data;

@Data
public class HotelDto {

    private Integer id;
    private String hotelName;
    private String address;
    private String city;
    private String country;
    private Double rating;
    private Integer numberOfRooms;

}

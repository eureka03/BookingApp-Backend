package bookingApp.dto;

import lombok.Data;

@Data
public class BookingDto {
    private Integer id;
    private Integer userId;
    private Integer hotelId;
    private Integer roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private Double totalPrice;
}

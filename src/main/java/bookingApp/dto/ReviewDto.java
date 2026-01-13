package bookingApp.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private Integer userId;
    private Integer hotelId;
    private Integer rating;
    private String comment;
}

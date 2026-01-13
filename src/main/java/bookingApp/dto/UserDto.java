package bookingApp.dto;

import lombok.Data;

@Data
public class UserDto {

    private Integer id;
    private String username;
    private String userEmail;
    private String phone;
}

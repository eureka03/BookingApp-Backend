package bookingApp.service;

import bookingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bookingApp.dto.UserDto;
import bookingApp.entity.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto){
        if(userDto.getUsername() == null){
            throw new IllegalArgumentException("Username cannot be null");

        }
        if(userDto.getUserEmail() == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        if(userRepository.findByEmail(userDto.getUserEmail()) != null) {
            throw new IllegalArgumentException("User already exists");
        }
        if(userDto.getPhone() == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }

        User savedUser = new User();
        savedUser.setUsername(userDto.getUsername());
        savedUser.setUserEmail(userDto.getUserEmail());
        savedUser.setUserPhone(userDto.getPhone());
        userRepository.save(savedUser);

        UserDto userDtoResponse = new UserDto();
        userDtoResponse.setUsername(savedUser.getUsername());
        userDtoResponse.setUserEmail(savedUser.getUserEmail());
        userDtoResponse.setPhone(savedUser.getUserPhone());
        userDtoResponse.setId(savedUser.getId());

        return userDtoResponse;

    }

    public UserDto updateUser(Integer id,UserDto userDto){
        if(userDto.getUsername() == null){
            throw new IllegalArgumentException("Username cannot be null");

        }
        if (userDto.getUserEmail() == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        if(userDto.getPhone() == null){
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        User existingUser = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("user not found"));

        existingUser.setUsername(userDto.getUsername());
        existingUser.setUserEmail(userDto.getUserEmail());
        existingUser.setUserPhone(userDto.getPhone());
        userRepository.save(existingUser);

        UserDto userDtoResponse = new UserDto();
        userDtoResponse.setUsername(existingUser.getUsername());
        userDtoResponse.setUserEmail(existingUser.getUserEmail());
        userDtoResponse.setPhone(existingUser.getUserPhone());
        userDtoResponse.setId(existingUser.getId());

        return userDtoResponse;

    }


}

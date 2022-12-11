package auction.converter;

import auction.dto.UserDto;
import auction.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserDto, User> {

    @Override
    public UserDto toDto(User user) {
        if (user != null) {
            UserDto userDto = new UserDto();
            userDto.setPassword(user.getPassword());
            userDto.setCity(user.getCity());
            userDto.setName(user.getName());
            userDto.setEmail(user.getEmail());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDto.setPhoneNumber(user.getPhoneNumber());
            return userDto;
        } else {
            return null;
        }
    }

    @Override
    public User toEntity(UserDto userDto) {
        if (userDto != null) {
            User user = new User();
            user.setPassword(userDto.getPassword());
            user.setName(userDto.getName());
            user.setCity(userDto.getCity());
            user.setEmail(userDto.getEmail());
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setPhoneNumber(userDto.getPhoneNumber());
            return user;
        } else {
            return null;
        }
    }


}

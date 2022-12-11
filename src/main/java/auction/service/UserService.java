package auction.service;

import auction.dto.UserDto;
import auction.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    List<User> findUsersByFirstNameAndLastName(String firstName, String lastName);

    User findUserByEmail(String email);

    UserDto findUserById(Long id);

    User save(UserDto userDto);

    void delete(Long id);

    List<User> findUsersByName(String nickName);

    void update(UserDto userDto, Long id);

}

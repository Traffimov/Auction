package auction.service.impl;

import auction.converter.UserConverter;
import auction.dto.UserDto;
import auction.model.User;
import auction.model.enums.UserRole;
import auction.repository.UserRepository;
import auction.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    @Override
    public List<User> findAll() {
        return userRepository.findAllBy();
    }

    @Override
    public List<User> findUsersByFirstNameAndLastName(String firstName, String lastName) {
        return new ArrayList<>(userRepository.findUsersByFirstNameAndLastName(firstName, lastName));
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public UserDto findUserById(Long id) {
        return userConverter.toDto(userRepository.findUserById(id));
    }

    @Override
    public User save(UserDto userDto) {
        User newUser = new User();
        newUser.setName(userDto.getName()); // todo проверка на идентичность
        newUser.setEmail(userDto.getEmail()); // todo проверка на идентичность
        newUser.setPhoneNumber(userDto.getPhoneNumber()); // todo проверка на идентичность
//        newUser.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        newUser.setUserRole(UserRole.Client);
        newUser.setCity(userDto.getCity());
        newUser.setFirstName(userDto.getFirstName());
        newUser.setLastName(userDto.getLastName());
        return userRepository.save(newUser);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findUserById(id);
        userRepository.delete(user);
    }

    @Override
    public List<User> findUsersByName(String nickname) {
        return userRepository.findUsersByName(nickname);
    }

    @Override
    public void update(UserDto userDto, Long id) {
        User oldUser = userRepository.findUserById(id);
        oldUser.setName(userDto.getName()); // todo проверка на идентичность
        oldUser.setCity(userDto.getCity());
        oldUser.setEmail(userDto.getEmail()); // todo проверка на идентичность
        oldUser.setFirstName(userDto.getFirstName());
        oldUser.setLastName(userDto.getLastName());
        oldUser.setPhoneNumber(userDto.getPhoneNumber()); // todo проверка на идентичность
        userRepository.save(oldUser);
    }

}

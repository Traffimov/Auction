package auction.service.impl;

import auction.model.User;
import auction.model.enums.UserRole;
import auction.repository.UserRepository;
import auction.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllByRole(UserRole userRole) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.getById(id);
        userRepository.delete(user);
    }

    @Override
    public List<User> getByNickname(String nickname) {
        return userRepository.findAllByName(nickname);
    }

    @Override
    public void update(User user, Long id) {
        User oldUser = userRepository.getById(id);
        oldUser.setName(user.getName());
        oldUser.setCity(user.getCity());
        oldUser.setEmail(user.getEmail());
        oldUser.setFirstName(user.getFirstName());
        oldUser.setLastName(user.getLastName());
        oldUser.setPhoneNumber(user.getPhoneNumber());
        userRepository.saveAndFlush(oldUser);
    }
}

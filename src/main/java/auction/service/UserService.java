package auction.service;

import auction.model.User;
import auction.model.enums.UserRole;

import java.util.List;

public interface UserService {

    List<User> getAllByRole(UserRole userRole);

    User findById(Long id);

    User save(User user);

    void delete(Long id);

    List<User> getByNickname(String nickName);

    void update(User user, Long id);

}

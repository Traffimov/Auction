package auction.repository;

import auction.model.User;
import auction.model.enums.UserRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findUsersByUserRole (UserRole userRole);

    List <User> findUsersByFirstNameAndLastName(String firstName, String lastName);

    User findUserByEmail(String email);

    User findUserById(Long id);

    List<User> findUsersByName(String name);

    List<User> findAllBy();

}

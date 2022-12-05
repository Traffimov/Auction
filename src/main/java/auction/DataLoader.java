//package auction;
//
//import auction.model.User;
//import auction.model.enums.UserRole;
//import auction.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader implements ApplicationRunner {
//
//    private final UserRepository userRepository;
//
//    private final PasswordEncoder passwordEncoder;
//
//    //private final CategoryDao categoryDao;
//
//    @Override
//    @Transactional
//    public void run(ApplicationArguments args) throws Exception {
//        initUsers();
//    }
//
//    private void initUsers() {
//        User employee1 = new User();
//        employee1.setEmail("user1_mogilev@yopmail.com");
//        employee1.setPassword(passwordEncoder.encode("P@ssword1"));
//        employee1.setUserRole(UserRole.Client);
//        employee1.setFirstName("FirstName");
//        employee1.setLastName("LastName");
//        employee1.setNickname("Nickname");
//        employee1.setCity("City");
//        employee1.setPhoneNumber(37533L);
//        employee1.setRate(2);
//
//        userRepository.save(employee1);
//    }
//}

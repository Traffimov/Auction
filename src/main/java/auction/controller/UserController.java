package auction.controller;

import auction.dto.UserDto;
import auction.model.User;
import auction.model.enums.UserRole;
import auction.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/registration") //todo исправить
    public ResponseEntity<Void> registration(@Valid @RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("findByEmail/{email}")
    public ResponseEntity<User> findUsersByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<UserDto> findUsersById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("findByName/{nickName}")
    public ResponseEntity<List<User>> findUsersByName(@PathVariable String nickName) {
        return ResponseEntity.ok(userService.findUsersByName(nickName));
    }

    @PutMapping("updateUser/{id}") //todo исправить
    public ResponseEntity<Void> updateUser(@RequestBody UserDto userDto,
                                           @PathVariable Long id) {
        userService.update(userDto, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

}

package gymproject.controller;

import gymproject.dto.User;
import gymproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to hello worlds";
    }
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userRepo.save(user);
    }
}

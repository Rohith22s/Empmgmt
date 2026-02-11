package com.icolleague.assistant.controller;

import org.springframework.web.bind.annotation.*;
import com.icolleague.assistant.model.User;
import com.icolleague.assistant.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    private final UserRepository repo;

    public LoginController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return repo.findByUsernameAndPassword(
                user.getUsername(),
                user.getPassword()
        );
    }
}
package com.booksmanag.demoproject1.controller;

import org.springframework.web.bind.annotation.*;
import com.booksmanag.demoproject1.model.User;
import com.booksmanag.demoproject1.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {

        if (id == 0) {
            throw new ResourceNotFoundException("User not found with id " + id);
        }

        return new User(id, "Ritesh Kengar");
    }
}

package com.movieapp.controller;


import com.movieapp.dto.UserDto;
import com.movieapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<Void> createAccount(@RequestBody UserDto userDto){



        userService.save(userDto);

        return ResponseEntity.ok().build();

    }


}

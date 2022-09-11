package com.movieapp.controller;


import com.movieapp.dto.UserDto;
import com.movieapp.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }


    @PostMapping
    public ResponseEntity<Void> login(@RequestBody UserDto userDto) {


        loginService.login(userDto);
        return ResponseEntity.ok().build();


    }


}

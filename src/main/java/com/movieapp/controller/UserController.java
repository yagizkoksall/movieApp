package com.movieapp.controller;


import com.movieapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;



    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/{idUser}/{idMovie}")
    public ResponseEntity<Void> personalMovieList(@PathVariable int idUser, @PathVariable int idMovie){


        userService.personalMovieList(idUser,idMovie);


        return ResponseEntity.ok().build();

    }




}

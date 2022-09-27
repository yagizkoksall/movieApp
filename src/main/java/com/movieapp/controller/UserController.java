package com.movieapp.controller;


import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;

    }


    @PostMapping("/{idUser}/movie/{idMovie}")
    public ResponseEntity<Void> addPersonalMovieList(@PathVariable int idUser, @PathVariable int idMovie) {


        userService.addPersonalMovieList(idUser, idMovie);


        return ResponseEntity.ok().build();

    }


    @GetMapping("/{idUser}")
    public List<UsersMoviesDto> getPersonalMovieList(@PathVariable int idUser) {



        return userService.getPersonalMovieList(idUser);
    }


}

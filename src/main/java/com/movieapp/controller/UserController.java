package com.movieapp.controller;


import com.movieapp.dto.UserSendMoviesDto;
import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private final IUserService userService;


    public UserController(IUserService userService) {
        this.userService = userService;

    }


    @PostMapping("/{idUser}/personal/{idMovie}")
    public ResponseEntity<Void> addPersonalMovieList(@PathVariable int idUser, @PathVariable int idMovie) {


        userService.addPersonalMovieList(idUser, idMovie);



        return ResponseEntity.ok().build();

    }


    @GetMapping("/{idUser}")
    public List<UsersMoviesDto> getPersonalMovieList(@PathVariable int idUser) {



        return userService.getPersonalMovieList(idUser);
    }

    @PostMapping()
    public ResponseEntity<Void> sendMovie(@RequestBody UserSendMoviesDto userSendMoviesDto){


        userService.sendMovie(userSendMoviesDto);


        return ResponseEntity.ok().build();

    }



}

package com.movieapp.controller;


import com.movieapp.dto.MovieDto;
import com.movieapp.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Void> addMovie(@RequestBody MovieDto movieDto){


        movieService.saveMovie(movieDto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<MovieDto> getallMovies(){





        return movieService.getAllMovies();

    }

}

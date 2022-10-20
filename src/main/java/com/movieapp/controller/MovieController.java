package com.movieapp.controller;


import com.movieapp.dto.MovieDto;
import com.movieapp.service.IMovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final IMovieService movieService;

    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Void> addMovie(@RequestBody MovieDto movieDto){


        movieService.saveMovie(movieDto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getallMovies(){





        return ResponseEntity.ok(movieService.getAllMovies());

    }



}

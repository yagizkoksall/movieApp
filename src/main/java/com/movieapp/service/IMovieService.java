package com.movieapp.service;

import com.movieapp.dto.MovieDto;
import com.movieapp.model.Movie;

import java.util.List;

public interface IMovieService {

    void saveMovie(MovieDto movieDto);

    Movie findMovie(int idMovie);

    List<MovieDto> getAllMovies();

}

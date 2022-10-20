package com.movieapp.service;

import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.model.Movie;
import com.movieapp.model.User;

import java.util.List;

public interface IUsersMoviesService {

    void savePersonalMovies(User user, Movie movie);
    List<UsersMoviesDto> getAllPersonalMovies(User user);


}

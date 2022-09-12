package com.movieapp.service;


import com.movieapp.dto.UserDto;
import com.movieapp.model.Movie;
import com.movieapp.model.User;
import com.movieapp.repository.UserRepository;
import com.movieapp.repository.UsersMoviesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UsersMoviesService usersMoviesService;
    private final MovieService movieService;

    public UserService(UserRepository userRepository, UsersMoviesService usersMoviesService, MovieService movieService) {
        this.userRepository = userRepository;
        this.usersMoviesService = usersMoviesService;
        this.movieService = movieService;
    }


    public void personalMovieList(int idUser, int idMovie) {


        Optional<User> userOptional = userRepository.findById(idUser);

        User user = userOptional.get();

        Movie movie = movieService.findMovie(idMovie);


        usersMoviesService.savePersonalMovies(user, movie);


    }

    public void getWatchedList(int id){




    }


}

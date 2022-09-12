package com.movieapp.service;


import com.movieapp.model.Movie;
import com.movieapp.model.User;
import com.movieapp.model.UsersMovies;
import com.movieapp.repository.UsersMoviesRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersMoviesService {

   private final UsersMoviesRepository usersMoviesRepository;

    public UsersMoviesService(UsersMoviesRepository usersMoviesRepository) {
        this.usersMoviesRepository = usersMoviesRepository;
    }

    public void savePersonalMovies(User user, Movie movie){

        UsersMovies usersMovies = new UsersMovies();

        usersMovies.setMovie(movie);
        usersMovies.setUser(user);



        usersMoviesRepository.save(usersMovies);

    }
}

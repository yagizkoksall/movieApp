package com.movieapp.service;


import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.model.Movie;
import com.movieapp.model.User;
import com.movieapp.model.UsersMovies;
import com.movieapp.repository.UsersMoviesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersMoviesService implements IUsersMoviesService{



    private final UsersMoviesRepository usersMoviesRepository;



    public UsersMoviesService(UsersMoviesRepository usersMoviesRepository) {
        this.usersMoviesRepository = usersMoviesRepository;
    }



    public void savePersonalMovies(User user, Movie movie) {

        UsersMovies usersMovies = new UsersMovies();

        usersMovies.setMovie(movie);
        usersMovies.setUser(user);


        usersMoviesRepository.save(usersMovies);

    }

    public List<UsersMoviesDto> getAllPersonalMovies(User user) {



        List<UsersMovies> usersMoviesList = usersMoviesRepository.findUsersMoviesByUser(user);

       return usersMoviesList.stream().map(UsersMoviesDto::new).collect(Collectors.toList());



    }




}

package com.movieapp.service;


import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.model.Movie;
import com.movieapp.model.User;
import com.movieapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public User getUser(int idUser){

        Optional<User> optionalUser = userRepository.findById(idUser);

        if(optionalUser.isPresent()){

            User user = new User();

            return user = optionalUser.get();

        }
        else{
            throw new RuntimeException("Kullanıcı bulunamadı.");
        }




    }


    public void addpersonalMovieList(int idUser, int idMovie) {



        User user = getUser(idUser);





        Movie movie = movieService.findMovie(idMovie);


        usersMoviesService.savePersonalMovies(user, movie);


    }

    public List<UsersMoviesDto> getPersonalMovieList(int idUser){

        User user = getUser(idUser);




      return usersMoviesService.getAllPersonalMovies(user);

    }


}

package com.movieapp.service;


import com.movieapp.dto.UserSendMoviesDto;
import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.model.Movie;
import com.movieapp.model.User;
import com.movieapp.model.UserSendMovies;
import com.movieapp.repository.UserRepository;
import com.movieapp.repository.UserSendMoviesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{


    private final UserRepository userRepository;
    private final UserSendMoviesRepository userSendMoviesRepository;
    private final UsersMoviesService usersMoviesService;
    private final MovieService movieService;


    public UserService(UserRepository userRepository, UserSendMoviesRepository userSendMoviesRepository,
                       UsersMoviesService usersMoviesService, MovieService movieService) {
        this.userRepository = userRepository;
        this.userSendMoviesRepository = userSendMoviesRepository;
        this.usersMoviesService = usersMoviesService;
        this.movieService = movieService;
    }

    public User getUser(int idUser) {

        Optional<User> optionalUser = userRepository.findById(idUser);

        if (optionalUser.isPresent()) {


            return optionalUser.get();

        } else {
            throw new RuntimeException("Kullanıcı bulunamadı.");
        }


    }


    public void addPersonalMovieList(int idUser, int idMovie) {


        User user = getUser(idUser);


        Movie movie = movieService.findMovie(idMovie);


        usersMoviesService.savePersonalMovies(user, movie);


    }

    public List<UsersMoviesDto> getPersonalMovieList(int idUser) {

        User user = getUser(idUser);


        return usersMoviesService.getAllPersonalMovies(user);

    }

    public void sendMovie(UserSendMoviesDto userSendMoviesDto){


        User userFrom = getUser(userSendMoviesDto.getIdUserFrom());
        User userTo = getUser(userSendMoviesDto.getIdUserTo());
        Movie movie = movieService.findMovie(userSendMoviesDto.getMovieId());

        UserSendMovies userSendMovies = new UserSendMovies();
        userSendMovies.setMovie(movie);
        userSendMovies.setUserFrom(userFrom);
        userSendMovies.setUserTo(userTo);
        userSendMoviesRepository.save(userSendMovies);


    }


}

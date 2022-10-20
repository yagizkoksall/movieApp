package com.movieapp.service;

import com.movieapp.dto.UserSendMoviesDto;
import com.movieapp.dto.UsersMoviesDto;
import com.movieapp.model.User;

import java.util.List;

public interface IUserService {

    User getUser(int idUser);

    void addPersonalMovieList(int idUser, int idMovie);

    List<UsersMoviesDto> getPersonalMovieList(int idUser);

    void sendMovie(UserSendMoviesDto userSendMoviesDto);


}

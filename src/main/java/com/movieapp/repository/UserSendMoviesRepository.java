package com.movieapp.repository;


import com.movieapp.model.UserSendMovies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSendMoviesRepository extends JpaRepository<UserSendMovies, Integer> {

}

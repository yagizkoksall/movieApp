package com.movieapp.repository;


import com.movieapp.model.User;
import com.movieapp.model.UsersMovies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsersMoviesRepository extends JpaRepository<UsersMovies, Integer> {



    List<UsersMovies> findUsersMoviesByUser(User user);


}

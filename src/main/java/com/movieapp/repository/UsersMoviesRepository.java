package com.movieapp.repository;

import com.movieapp.model.UsersMovies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersMoviesRepository extends JpaRepository<UsersMovies, Integer> {



}

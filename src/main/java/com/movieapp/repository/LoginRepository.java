package com.movieapp.repository;


import com.movieapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository  extends JpaRepository<User, String> {

   Optional<User> findUserByMailAndPassword(String mail, String password);

}

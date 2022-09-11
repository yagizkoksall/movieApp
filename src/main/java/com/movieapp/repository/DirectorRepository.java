package com.movieapp.repository;

import com.movieapp.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DirectorRepository extends JpaRepository<Director, Integer > {

     Optional<Director> findDirectorByFirstNameAndLastName(String name, String lastName);

}

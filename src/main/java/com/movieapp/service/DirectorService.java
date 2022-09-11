package com.movieapp.service;


import com.movieapp.exception.IsEmptyException;
import com.movieapp.model.Director;
import com.movieapp.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public void getDirectorById(Director director){



    }

    public Director getDirectorByName(String firstName, String lastName){
        Optional<Director>  directorOptional= directorRepository.findDirectorByFirstNameAndLastName(firstName,lastName);

        if(directorOptional.isPresent()){
            Director director = new Director();
            director = directorOptional.get();
            return director;
        }
        else{
           throw new  IsEmptyException("Yönetmen bulunamadı.");
        }

    }


}

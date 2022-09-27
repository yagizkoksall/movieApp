package com.movieapp.service;


import com.movieapp.dto.DirectorDto;
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

   

    public Director getDirectorByName(DirectorDto directorDto) {
        Optional<Director> directorOptional = directorRepository.findDirectorByFirstNameAndLastName(directorDto.getDirectorFirstName(),directorDto.getDirectorLastName());

        if (directorOptional.isPresent()) {

            return directorOptional.get();

        } else {
            throw new IsEmptyException("Yönetmen bulunamadı.");
        }

    }


}

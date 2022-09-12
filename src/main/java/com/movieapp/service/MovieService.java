package com.movieapp.service;

import com.movieapp.dto.MovieDto;
import com.movieapp.model.Director;
import com.movieapp.model.Movie;
import com.movieapp.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final DirectorService directorService;

    public MovieService(MovieRepository movieRepository, DirectorService directorService) {
        this.movieRepository = movieRepository;
        this.directorService = directorService;
    }


    public void saveMovie(MovieDto movieDto){
            Movie movie = new Movie();

       Director director =  directorService.getDirectorByName(movieDto.getDirectorFirstName(),
               movieDto.getDirectorLastName());



          movie.setDirector(director);
          movie.setMovieYear(movieDto.getMovieYear());
          movie.setComment(movieDto.getComment());
          movie.setSummary(movieDto.getSummary());
          movie.setImdb(movieDto.getImdb());
          movie.setTime(movieDto.getTime());

          movieRepository.save(movie);

    }
    public Movie findMovie(int idMovie){

    Optional<Movie> movieOptional =  movieRepository.findById(idMovie);
    Movie movie = movieOptional.get();

    return movie;

    }

}

package com.movieapp.service;

import com.movieapp.dto.MovieDto;
import com.movieapp.model.Director;
import com.movieapp.model.Movie;
import com.movieapp.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final DirectorService directorService;

    public MovieService(MovieRepository movieRepository, DirectorService directorService) {
        this.movieRepository = movieRepository;
        this.directorService = directorService;
    }


    public void saveMovie(MovieDto movieDto) {
        Movie movie = new Movie();

        Director director = directorService.getDirectorByName(movieDto.getDirectorDto());


        movie.setDirector(director);
        movie.setMovieYear(movieDto.getMovieYear());
        movie.setComment(movieDto.getComment());
        movie.setSummary(movieDto.getSummary());
        movie.setImdb(movieDto.getImdb());
        movie.setTime(movieDto.getTime());

        movieRepository.save(movie);

    }

    public Movie findMovie(int idMovie) {

        Optional<Movie> movieOptional = movieRepository.findById(idMovie);

        if (movieOptional.isPresent()) {
            return movieOptional.get();

        }
        else{
            throw new RuntimeException("Film bulunamadı.");
        }


    }

    public List<MovieDto> getAllMovies() {

        List<Movie> movieList = movieRepository.findAll();


        return movieList.stream().map(MovieDto::new).collect(Collectors.toList());


    }

}

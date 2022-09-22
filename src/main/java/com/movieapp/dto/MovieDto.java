package com.movieapp.dto;


import com.movieapp.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto extends directorDto {


    private Date movieYear;
    private int imdb;
    private String comment;
    private String summary;
    private String time;

    public MovieDto(Movie movie){
        this.movieYear = movie.getMovieYear();
        this.imdb = movie.getImdb();
        this.comment = movie.getComment();
        this.summary = movie.getSummary();
        this.time = movie.getTime();
        this.setDirectorFirstName(movie.getDirector().getFirstName());
        this.setDirectorLastName(movie.getDirector().getLastName());


    }
}

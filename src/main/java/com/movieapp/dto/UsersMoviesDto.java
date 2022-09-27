package com.movieapp.dto;


import com.movieapp.model.UsersMovies;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersMoviesDto {


    private MovieDto movieDto;


    public UsersMoviesDto(UsersMovies usersMovies) {
        this.movieDto = new MovieDto(usersMovies.getMovie());


    }


}

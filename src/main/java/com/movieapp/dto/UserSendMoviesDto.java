package com.movieapp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSendMoviesDto {

    private int idUserFrom;
    private int idUserTo;
    private int movieId;



}

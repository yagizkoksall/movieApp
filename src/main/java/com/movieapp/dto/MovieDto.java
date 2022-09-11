package com.movieapp.dto;


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
}

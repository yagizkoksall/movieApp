package com.movieapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;

    private Date movieYear;

    private int imdb;
    private String comment;
    private String summary;
    private String time;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;



}

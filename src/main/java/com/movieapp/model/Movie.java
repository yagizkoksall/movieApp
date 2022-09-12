package com.movieapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


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

    //leetcode

/*
    @OneToMany(mappedBy = "movie")
    Set<UsersMovies> usersMovies;


 */
/*

    @ManyToMany(mappedBy = "movies")
    private List<User> users = new ArrayList<User>();


 */

}

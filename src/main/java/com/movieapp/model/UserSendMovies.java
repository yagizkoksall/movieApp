package com.movieapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_send_movie")
public class UserSendMovies {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user_from")
    private User userFrom;

    @ManyToOne
    @JoinColumn(name = "id_user_to")
    private User userTo;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;



}

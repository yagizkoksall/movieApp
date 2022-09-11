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

@Table(name = "director")
public class Director{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "director_id")
        private int idDirector;

        private String firstName;
        private String lastName;

        @Column(name = "about_director")
        private String aboutDirector;
        private Date birthday;





}

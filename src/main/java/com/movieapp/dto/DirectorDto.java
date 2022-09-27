package com.movieapp.dto;


import com.movieapp.model.Director;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDto extends BaseDto {

    private String directorFirstName;
    private String directorLastName;


    public DirectorDto(Director director){

        this.directorFirstName = director.getFirstName();
        this.directorLastName = director.getLastName();


    }

}

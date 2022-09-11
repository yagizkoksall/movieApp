package com.movieapp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class directorDto extends BaseDto {

    private String directorFirstName;
    private String directorLastName;

}

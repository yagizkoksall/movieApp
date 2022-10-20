package com.movieapp.service;

import com.movieapp.dto.UserDto;

public interface ILoginService {

    void save(UserDto userDto);

    void login(UserDto userDto);

}

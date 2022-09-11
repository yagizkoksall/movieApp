package com.movieapp.service;


import com.movieapp.dto.UserDto;
import com.movieapp.model.User;
import com.movieapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void save(UserDto userDto) {

        User user = new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setBirthday(userDto.getBirthday());
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());


        userRepository.save(user);

    }


}

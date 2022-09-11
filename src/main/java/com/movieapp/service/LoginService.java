package com.movieapp.service;


import com.movieapp.dto.UserDto;
import com.movieapp.model.User;
import com.movieapp.repository.LoginRepository;
import com.movieapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {


    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void login(UserDto userDto){

       Optional<User> userOptional = loginRepository.
               findUserByMailAndPassword(userDto.getMail(),
                       userDto.getPassword());


       if(userOptional.isEmpty()){

           throw new RuntimeException("Kullanıcı adı veya şifre hatalı.");

        }



    }


}

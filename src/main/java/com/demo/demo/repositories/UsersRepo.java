package com.demo.demo.repositories;

import com.demo.demo.dto.CreateUserDTO;
import com.demo.demo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UsersRepo {
    List<UserDto> users = new ArrayList<>();

    public UsersRepo(){
        users.add(new UserDto(1234, "zq8281@gmail.com", "Zeeshan"));
        users.add(new UserDto(5678, "lallilal@gmail.com", "Lalu"));
        users.add(new UserDto(9101112, "kamles@gmail.com", "Kamal Singh"));
    }

    public List<UserDto> findAll(){
        return users;
    }

    public UserDto findById(Long id){
        for(UserDto user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public UserDto create(CreateUserDTO user){
        UserDto newUser = new UserDto((long)Math.random()*100, user.name(), user.email());
        users.add(newUser);
        return newUser;
    }
}

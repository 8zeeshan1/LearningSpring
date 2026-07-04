package com.demo.demo.repositories;

import com.demo.demo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UsersRepo {
    List<UserDto> users = new ArrayList<>();

    public UsersRepo(){
        users.add(new UserDto("salama101", "zq8281@gmail.com", "Zeeshan"));
        users.add(new UserDto("lalua202", "lallilal@gmail.com", "Lalu"));
        users.add(new UserDto("chattis36", "kamles@gmail.com", "Kamal Singh"));
    }

    public List<UserDto> findAll(){
        return users;
    }
}

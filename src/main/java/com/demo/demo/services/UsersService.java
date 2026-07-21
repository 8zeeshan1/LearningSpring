package com.demo.demo.services;

import com.demo.demo.dto.CreateUserDTO;
import com.demo.demo.dto.UserDto;
import com.demo.demo.repositories.UsersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    final private UsersRepo repo;
    public UsersService(UsersRepo repo){
        this.repo = repo;
    }

    public List<UserDto> getAllUsers(){
        return repo.findAll();
    }

    public UserDto getUserById(Long id){
        return repo.findById(id);
    }

    public UserDto createUser(CreateUserDTO user){
        return repo.create(user);
    }
}

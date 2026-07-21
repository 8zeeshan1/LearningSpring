package com.demo.demo.Controller;
import java.util.List;

import com.demo.demo.dto.CreateUserDTO;
import com.demo.demo.dto.UserDto;
import com.demo.demo.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    final private UsersService userSvc;

    UsersController(UsersService userSvc){
        this.userSvc = userSvc;
    }

    @GetMapping("/getAllUsers")
    public List<UserDto> getUsers(){
        return userSvc.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userSvc.getUserById(id));
    }

    @PostMapping()
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDTO user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userSvc.createUser(user));
    }
}

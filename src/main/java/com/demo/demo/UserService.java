package com.demo.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    Database db;
    public UserService(Database db){
        this.db = db;
    }

    public void saveUser(String user){
        System.out.println("UserService is saving the user: "+user);
        db.save(user);
    }
}

package com.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class MySqlDb implements Database {

    @Override
    public void save(String user){
        System.out.println("MySqlDb is saving the user: "+user);
    }

}

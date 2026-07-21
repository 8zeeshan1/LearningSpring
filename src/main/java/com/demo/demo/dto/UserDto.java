package com.demo.demo.dto;

import java.rmi.server.UID;

public class UserDto {
    private long id;
    private String email;
    private String name;

    public UserDto(long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// DTO is basically a Data Transfer Object which serves the data across the services whatever needed only, without
// giving them the access of unnecessary properties.

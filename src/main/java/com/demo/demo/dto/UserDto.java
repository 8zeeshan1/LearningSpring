package com.demo.demo.dto;

public class UserDto {
    private String id;
    private String email;
    private String name;

    public UserDto(String id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
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

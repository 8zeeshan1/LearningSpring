package com.demo.demo.dto;

public class CreateUserDTO {
    private String name;
    private String email;

    public CreateUserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

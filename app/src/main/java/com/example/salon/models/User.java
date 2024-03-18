package com.example.salon.models;

public class User {
    private String name;
    private String email;
    private int profileImageId;

    public User(String name, String email, int profileImageId) {
        this.name = name;
        this.email = email;
        this.profileImageId = profileImageId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getProfileImageId() {
        return profileImageId;
    }
}

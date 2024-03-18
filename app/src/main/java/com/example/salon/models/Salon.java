package com.example.salon.models;

public class Salon {
    private String name;
    private String address;
    private double rating;
    private int imageResourceId;

    public Salon(String name, String address, double rating, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getRating() {
        return rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}


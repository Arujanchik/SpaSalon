package com.example.salon;

public class ServiceItem {
    private String title;
    private String description;
    private int imageResourceId;
    private String price; // Добавить цену
    private String address; // Добавить адрес

    public ServiceItem(String title, String description, int imageResourceId, String price, String address) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.price = price;
        this.address = address;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public String getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
}

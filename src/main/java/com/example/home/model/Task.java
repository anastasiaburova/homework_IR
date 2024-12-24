package com.example.home.model;

public class Task {
    private int id;
    private String item;

    // Конструктор
    public Task(int id, String item) {
        this.id = id;
        this.item = item;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}


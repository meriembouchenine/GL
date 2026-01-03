package com.l3.gl.model;

public class Product {
    private String title;
    private String date;
    private String time;

    public Product(String title, String date, String time) {
        this.title = title;
        this.date = date;
        this.time = time;
    }

    public String toFileString() {
        return title + ";" + date + ";" + time;
    }

    @Override
    public String toString() {
        return title + " | " + date + " | " + time;
    }

    public static Product fromFileString(String line) {
        String[] parts = line.split(";");
        return new Product(parts[0], parts[1], parts[2]);
    }
}
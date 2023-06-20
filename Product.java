package org.example.Homework.HW3;

public class Product {
    private String name;
    private double price;
    private String grade;

    public Product(String name, double price, String grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getGrade() {
        return grade;
    }
}
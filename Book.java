package org.example.Homework.HW3;

public class Book {
    private String title;
    private String authorLastName;
    private double price;
    private int year;
    private int pageCount;

    public Book(String title, String authorLastName, double price, int year, int pageCount) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.price = price;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }
}
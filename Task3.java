package org.example.Homework.HW3;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", "Smith", 10.0, 2015, 200));
        books.add(new Book("Book 2", "Johnson", 15.0, 2012, 150));
        books.add(new Book("Book 3", "Adams", 20.0, 2014, 97));
        books.add(new Book("Book 4", "Anderson", 25.0, 2018, 250));
        books.add(new Book("Book 5", "Williams", 30.0, 2016, 220));

        List<String> bookTitles = findBooksWithCriteria(books);
        System.out.println("Названия книг, удовлетворяющих условиям: " + bookTitles);
    }

    public static List<String> findBooksWithCriteria(List<Book> books) {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : books) {
            if (isPrime(book.getPageCount()) &&
                    book.getAuthorLastName().contains("A") &&
                    book.getYear() >= 2010) {
                bookTitles.add(book.getTitle());
            }
        }
        return bookTitles;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

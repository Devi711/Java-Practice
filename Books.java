package com.gitPractice;

import java.util.*;

public class Books {
    static class Book {
        int id;
        String title;
        String author;
        double price;

        Book(int id, String title, String author, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book [ID=" + id + ", Title=" + title +
                   ", Author=" + author + ", Price=" + price + "]";
        }
    }

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java Basics", "John Smith", 299.99));
        books.add(new Book(2, "Spring Boot Guide", "Jane Doe", 499.50));
        books.add(new Book(3, "Microservices in Java", "Tom White", 599.00));

        System.out.println("All Books:");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("\nBooks with price > 400:");
        for (Book b : books) {
            if (b.price > 400) {
                System.out.println(b);
            }
        }  
        System.out.println("\nSearching for Book with ID = 2:");
        for (Book b : books) {
            if (b.id == 2) {
                System.out.println("Found: " + b);
                break;
            }
        }
    }
}

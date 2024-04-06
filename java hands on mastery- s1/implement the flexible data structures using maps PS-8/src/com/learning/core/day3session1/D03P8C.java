package com.learning.core.day3session1;

import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private String dateOfPublication;

    // Constructor
    public Book(int bookId, String title, double price, String author, String dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    // Implementing natural ordering based on author names
    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
    }

    // Overriding equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}

public class D03P8C {
    public static void main(String[] args) {
        // Creating a TreeSet of Book objects with natural ordering based on author names
        TreeSet<Book> bookSet = new TreeSet<>();

        // Adding predefined book details
        bookSet.add(new Book(1002, "Maden Maitame", 205.0, "Sarad Brown", "8/5/102"));
        bookSet.add(new Book(1003, "Avan Ramime", 230.0, "Shara Brach", "12/15/7984"));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));

        // Printing all book details sorted by author names
        System.out.println("Output:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
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
        return title + " " + price + " " + author + " " + dateOfPublication;
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

public class D03P8D {
    public static void main(String[] args) {
        // Creating a TreeSet of Book objects with natural ordering based on author names
        TreeSet<Book> bookSet = new TreeSet<>();

        // Adding predefined book details
        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));

        // Printing all book details sorted by author names
        System.out.println("Output:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
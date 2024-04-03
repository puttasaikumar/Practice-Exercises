package com.learning.core.day1session1;

class Book {
    private String title;
    private double price;

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class D01P0 {
    // Method to create a Book object
    public static Book createBook(String title, double price) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }

    // Method to display Book details
    public static void showBook(Book book) {
        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
    }

    public static void main(String[] args) {
        // Input
        String title = "Java Programming";
        double price = 350.00;

        // Creating a Book object
        Book book = createBook(title, price);

        // Displaying Book details
        showBook(book);
    }
}
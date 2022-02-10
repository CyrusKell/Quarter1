/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author cyrus.kell
 */
public class BookApp_1 {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "Fitzgerald", 10.00);
        SoftBook softBook = new SoftBook("The Great Gatsby", "Fitzgerald", 10.00, "pdf");
        System.out.println(book);
        System.out.println(softBook);
    }
}

class Book {
    String name;
    String author;
    double price;
    public Book() {
        name = "";
        author = "";
        price = 0;
    }
    public Book(String name, String author, double price) {
        this.name = name; 
        this.author = author;
        this.price = price;
    }
    public String toString() {
        return "Name: " + name + " Author: " + author + " Price: " + price;
    }
}

class SoftBook extends Book {
    String type;
    public SoftBook() {
        type = "";
    }
    public SoftBook(String name, String author, double price, String type) {
        super(name, author, price);
        this.type = type;
    }
    public String toString() {
        return super.toString() + " Type: " + type;
    }
}
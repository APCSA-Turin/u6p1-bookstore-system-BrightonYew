package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
// all the get and set methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String newtitle) {
        title = newtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newauthor) {
        author = newauthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newyearpublished) {
        yearPublished = newyearpublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String newisbn) {
        isbn = newisbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newquantity) {
        quantity = newquantity;
    }
    //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String bookInfo() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getYearPublished() + ", ISBN: " + getIsbn() + ", Quantity: " + getQuantity();
    }
       
}
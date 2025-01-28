package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book = null;

    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String newId) {
        Id = newId;
    }

    public Book[] getBooks() {
        return book;
    }

    public void setBooks(Book[] newbook) {
        book = newbook;
    }


public String bookListInfo() {
    if (book == null || book.length == 0) { //if null, all 5 are empty
        return "empty\nempty\nempty\nempty\nempty\n";
    }
    String str = new String();
    for (int i = 0; i < 5; i++) { 
        if (book[i] == null) { //if a specific element null, report it empty
            str += "empty\n";
        } else { //else, print out everything about the bookv
            str += "Title: " + book[i].getTitle()
               + ", Author: " + book[i].getAuthor()
               + ", Year: " + book[i].getYearPublished()
               + ", ISBN: " + book[i].getIsbn()
               + ", Quantity: " + book[i].getQuantity()
               + "\n";
        }
    }
    return str;
}

// Returns the full user info, including the book list
public String userInfo() {
    return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
}
       
}
package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book[] books = new Book[5];
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}

    public User[] getUsers(){
        return users;
    }

    public void setUsers(User[] newUsers){
        users = newUsers;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addUser(User user) {
        boolean reachedempty = false;
        for (int i = 0; i < books.length; i++) { //searches for the earliest instance of a empty spot
            if (users[i] == null && reachedempty == false) {
                reachedempty = true; //"reachedempty" makes sure this only happens once
                users[i] = user; //adds user to the list
            }
        }
    }

    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) { // searches if each element equals user, and makes it null
                users[i] = null;
            }
        }
        consolidateUsers(); //compresses so that there is no null elements in between
    }

    public void consolidateUsers(){
        User[] newList = new User[users.length]; //creates a list
        int addindex = 0;
        for (int j = 0; j < users.length; j++) { //copies elements from one list to another, but if it is not nulls
            if (users[j] != null) {
                newList[addindex] = users[j];
                addindex++; //makes sure that if null, the new list lags behind one step, so no null values in between
            }
        }
        users = newList;//replace the list with the new list
    }

    public void addBook(Book book) {
        boolean reachedempty = false;
        for (int i = 0; i < books.length; i++) { //goes through each element, looking for the earliest null
            if (books[i] == null && reachedempty == false) {
                reachedempty = true;
                books[i] = book; //assigns book to that earliest null
            }
        }
    }

    public void insertBook(Book book, int index) {
        Book[] newlist = new Book[5];
        for (int j = 0; j < newlist.length; j++) { //copies the list
            newlist[j] = books[j];
        }
        newlist[index] = book; //adds the new book
        for (int i = index + 1; i < books.length; i++) { //copies the rest of the books, with a shift
            newlist[i] = books[i - 1];
        }
        books = newlist;
    }

    public void removeBook(Book book) {
        int length = 0;
        for (int i = 0; i < books.length; i++) { //goes through each element and checks if it equals book
            if (books[i] != null && books[i].equals(book)) {
                if (books[i].getQuantity() == 1) { //if only one copy, remove it, and lower the list length by one
                    books[i] = null;
                    length = books.length - 1;
                } else { //if multiple copies, just reduce its quantity by one
                    books[i].setQuantity(books[i].getQuantity() - 1);
                    length = books.length;
                }
            }
        }
        //just consolidate code, but with books instead of users
        Book[] newList = new Book[length]; //creates a list, based on if it or not removed a book
        int addindex = 0;
        for (int j = 0; j < books.length; j++) { //copies elements from one list to another, but if it is not nulls
            if (books[j] != null) {
                newList[addindex] = books[j];
                addindex++;
            }
        }
        books = newList;
    }
       //you are not tested on this method but use it for debugging purposes
    public String bookStoreBookInfo() {
        String str = "";
        for (int i = 0; i < books.length; i++) {
            str += books[i].getTitle() + "\n";
        }
        return str;
    }
 //you are not tested on this method but use it for debugging purposes
    public String bookStoreUserInfo(){
        String str = "";
        for (int i = 0; i < books.length; i++) {
            if (users[i] != null) {
                str += users[i].getName() + " " + users[i].getId() + " " + i + users[i] + "\n";
            } else {
                str += "null\n";
            }
            }
            str += users.length;
        return str;
    }
}
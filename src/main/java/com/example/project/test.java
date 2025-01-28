package com.example.project;




public class test {
    public static void main(String[] args) {
        IdGenerate.reset();
        BookStore store = new BookStore(); //create a new bookstore with 6 empty books
        IdGenerate.generateID();
        User u1 = new User("John",IdGenerate.getCurrentId());
        System.out.println(u1);
        IdGenerate.generateID();
        User u2 = new User("Jane",IdGenerate.getCurrentId());
        System.out.println(u2);
        IdGenerate.generateID();
        User u3 = new User("Mary",IdGenerate.getCurrentId());
        System.out.println(u3);
        IdGenerate.generateID();
        User u4 = new User("Alex",IdGenerate.getCurrentId());
        System.out.println(u4);
        store.addUser(u1);store.addUser(u2);store.addUser(u3);store.addUser(u4);
        System.out.println("Remove nothing");
        System.out.println(store.bookStoreUserInfo());


        System.out.println("Remove Jane");
        store.removeUser(u2);
        System.out.println(store.bookStoreUserInfo());


        System.out.println("Remove John");
        store.removeUser(u1);
        System.out.println(store.bookStoreUserInfo());


        System.out.println("Remove Alex");
        store.removeUser(u4);
        System.out.println(store.bookStoreUserInfo());


        System.out.println("Remove Mary");
        store.removeUser(u3);
        System.out.println(store.bookStoreUserInfo());


    }
}

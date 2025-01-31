package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    private static String currentId = "99";
    
    // //requires 1 private attribute String currentId. You must initialize it to 99

    // //requires one empty constructor
    public IdGenerate() {}


    public static String getCurrentId(){
        return currentId;
    }
    //must reset the currentId back to 99
    public static void reset() {
        currentId = "99";
    }

//generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public static void generateID() {
        Integer n = Integer.parseInt(currentId); //Needs to turn currentId to integer
        n++; //increments by 1
        currentId = n.toString(); //turns it back to a string
    } 
}
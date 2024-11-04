/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhnnn
 */

//1. Create a constructor named Exam that assigns "Good luck" to a previously declared String variable named message.
public class Exam {
    private String message;

    public Exam() {
        this.message = "Good luck";
    }
}


//2. Create an empty overloaded constructor for the Exam class with two (2) String parameters named period and level.
public Exam(String period, String level) {
    // Empty constructor with two parameters
}


//3. Declare a double-type accessor named getPrice that returns the value of price.
private double price;

public double getPrice() {
    return price;
}


//4. Declare a boolean-type accessor named isFinished that returns the value of status.
private boolean status;

public boolean isFinished() {
    return status;
}


//5. Declare a class named Midterm that inherits from the class named Exam.
public class Midterm extends Exam {
    // Midterm inherits from Exam
}


//6. Create three (3) class declarations to show multiple levels of inheritance. Use the classes named Exam, Midterm, and Essay.
public class Exam {
    // Base class
}

public class Midterm extends Exam {
    // Derived class from Exam
}

public class Essay extends Midterm {
    // Derived class from Midterm, creating multiple levels of inheritance
}


//7. Create a constructor named Midterm that prints "Exam has started." using println(). Its first statement should be a call to a constructor in the parent class.
public class Midterm extends Exam {
    public Midterm() {
        super(); // Call to parent class constructor
        System.out.println("Exam has started.");
    }
}


//8. Given the base class named Quiz and the derived class named Essay, write a statement to show inheritance between these classes.
public class Quiz {
    // Base class 
}

public class Essay extends Quiz {
    // Derived class
}

//Quiz is the base (or parent) class. While, The Essay is the derived (or child) class and inherits from Quiz.
/*
 * Algorithm for Constructor Implementation
 *
 * 1.  Define a class, e.g., 'Student'.
 * 2.  Declare instance variables within the class, e.g., 'name' and 'age'.
 * 3.  Create a constructor with the same name as the class. This constructor will be called automatically when an object is created.
 * 4.  The constructor should take parameters and use them to initialize the instance variables of the object using the 'this' keyword.
 * 5.  In the main method, create an object of the class using the 'new' keyword and pass the required arguments to the constructor.
 * 6.  Call a method to display the object's state to verify that the constructor worked.
 *
 * Pseudocode
 *
 * class Student:
 * string name
 * int age
 *
 * constructor(studentName, studentAge):
 * this.name = studentName
 * this.age = studentAge
 *
 * function displayInfo():
 * print "Name: " + this.name
 * print "Age: " + this.age
 *
 * main:
 * student1 = new Student("Alice", 20)
 * student1.displayInfo()
 */

public class ConstructorExample {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize the object
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called for " + this.name);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object, which automatically calls the constructor
        ConstructorExample student1 = new ConstructorExample("Alice", 20);
        student1.displayInfo();
    }
}

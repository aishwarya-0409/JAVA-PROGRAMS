/*
 * Algorithm for Class Implementation
 *
 * 1.  Define a class, e.g., 'Car'.
 * 2.  Inside the class, declare instance variables (attributes), e.g., 'brand', 'model', and 'year'.
 * 3.  Define methods (behaviors) within the class, e.g., 'startEngine()' and 'displayInfo()'.
 * 4.  The 'main' method should be in a separate class or the same one.
 * 5.  In the 'main' method, create an object (instance) of the 'Car' class using the 'new' keyword.
 * 6.  Access and modify the object's attributes using the dot operator.
 * 7.  Call the object's methods using the dot operator.
 *
 * Pseudocode
 *
 * class Car:
 * string brand
 * string model
 * int year
 *
 * function displayInfo():
 * print "Brand: " + this.brand
 * print "Model: " + this.model
 * print "Year: " + this.year
 *
 * main:
 * myCar = new Car()
 * myCar.brand = "Toyota"
 * myCar.model = "Corolla"
 * myCar.year = 2022
 * myCar.displayInfo()
 */

public class ClassExample {
    // Attributes of the class
    String brand;
    String model;
    int year;

    // A method to display the car's information
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        ClassExample myCar = new ClassExample();

        // Setting the object's attributes
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2022;

        // Calling the object's method
        myCar.displayInfo();
    }
}
/*
 * Algorithm for Abstract Class Implementation
 *
 * 1.  Define an abstract class using the 'abstract' keyword, e.g., 'Shape'.
 * 2.  An abstract class can have both abstract methods (without a body) and concrete methods (with a body).
 * 3.  Define an abstract method, e.g., 'abstract double calculateArea();'. An abstract method must be implemented by any concrete subclass.
 * 4.  Define a concrete method, e.g., 'displayMessage()', which has a body.
 * 5.  Create a concrete subclass, e.g., 'Circle', that extends the abstract class.
 * 6.  The subclass must provide an implementation for all abstract methods inherited from the abstract class.
 * 7.  In the 'main' method, you cannot create an object of the abstract class directly. Instead, create an object of the concrete subclass.
 * 8.  Call both the implemented abstract method and the inherited concrete method on the subclass object.
 *
 * Pseudocode
 *
 * abstract class Shape:
 * abstract double calculateArea()
 * function displayMessage():
 * print "This is a shape."
 *
 * class Circle extends Shape:
 * double radius
 *
 * @Override
 * double calculateArea():
 * return PI * radius * radius
 *
 * main:
 * circle = new Circle()
 * circle.radius = 5.0
 * area = circle.calculateArea()
 * circle.displayMessage()
 */

// Abstract class
abstract class Shape {
    // Abstract method (no body)
    public abstract double calculateArea();

    // Concrete method (with a body)
    public void displayMessage() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class
        // Shape myShape = new Shape(); // This would cause a compile-time error

        // Creating an object of the concrete subclass
        Circle myCircle = new Circle(10.0);

        // Calling the implemented abstract method
        System.out.println("Area of the circle: " + myCircle.calculateArea());

        // Calling the inherited concrete method
        myCircle.displayMessage();
    }
}


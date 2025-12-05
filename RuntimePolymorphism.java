/*
 * Algorithm for Runtime Polymorphism with Dynamic Method Dispatch
 *
 * 1.  Define a base class, e.g., 'Shape', with a method, e.g., 'draw()'.
 * 2.  Define multiple subclasses, e.g., 'Circle' and 'Rectangle', that extend the base class.
 * 3.  Override the 'draw()' method in each subclass with its own specific implementation.
 * 4.  In the 'main' method, create a reference variable of the base class type: 'Shape myShape;'.
 * 5.  Assign an object of one of the subclasses to this reference: 'myShape = new Circle();'.
 * 6.  Call the overridden method on the base class reference: 'myShape.draw();'.
 * 7.  At runtime, the JVM determines the actual object type and executes the correct overridden method. This is dynamic method dispatch.
 * 8.  Repeat for other subclasses to demonstrate polymorphism.
 *
 * Pseudocode
 *
 * class Shape:
 * function draw():
 * print "Drawing a generic shape."
 *
 * class Circle extends Shape:
 * @Override
 * function draw():
 * print "Drawing a circle."
 *
 * class Rectangle extends Shape:
 * @Override
 * function draw():
 * print "Drawing a rectangle."
 *
 * main:
 * Shape myShape
 * myShape = new Circle()
 * myShape.draw()
 *
 * myShape = new Rectangle()
 * myShape.draw()
 */

// Base class
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // A reference variable of type Shape
        Shape myShape;

        // Assigning a Circle object to the Shape reference
        myShape = new Circle();
        // The JVM calls the draw() method of the Circle class at runtime
        myShape.draw();

        // Assigning a Rectangle object to the Shape reference
        myShape = new Rectangle();
        // The JVM calls the draw() method of the Rectangle class at runtime
        myShape.draw();
    }
}

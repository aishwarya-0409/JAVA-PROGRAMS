/*
 * Algorithm for Interface Implementation
 *
 * 1.  Define an interface using the 'interface' keyword, e.g., 'Drawable'.
 * 2.  Interfaces contain abstract methods by default. Define a method signature, e.g., 'void draw();'.
 * 3.  Create a concrete class, e.g., 'Circle', that implements the interface using the 'implements' keyword.
 * 4.  The class must provide a public implementation for all methods defined in the interface.
 * 5.  In the 'main' method, create an object of the class that implements the interface.
 * 6.  You can also create a reference variable of the interface type and assign it to an object of the implementing class, demonstrating polymorphism.
 * 7.  Call the methods defined in the interface through the object reference.
 *
 * Pseudocode
 *
 * interface Drawable:
 * function draw()
 * function resize()
 *
 * class Circle implements Drawable:
 * @Override
 * function draw():
 * print "Drawing a circle."
 *
 * @Override
 * function resize():
 * print "Resizing the circle."
 *
 * main:
 * myCircle = new Circle()
 * myCircle.draw()
 * myCircle.resize()
 */

// Interface definition
interface Drawable {
    void draw();
    void resize();
}

// Class that implements the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the circle.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an object of the implementing class
        Drawable myCircle = new Circle();

        // Calling the methods defined in the interface
        myCircle.draw();
        myCircle.resize();
    }
}

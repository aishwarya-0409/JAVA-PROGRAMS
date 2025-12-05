/*
 * Algorithm for Method Overloading in a Single Class
 *
 * 1.  Define a class, e.g., 'ShapeDrawer'.
 * 2.  Create multiple instance methods with the same name, e.g., 'draw()'.
 * 3.  The methods must have different parameters (number, type, or order).
 * 4.  In the 'main' method, create an object of the class.
 * 5.  Call the overloaded methods using the object. The Java compiler will select the correct method at compile time based on the arguments provided.
 *
 * Pseudocode
 *
 * class ShapeDrawer:
 * function draw(radius):
 * print "Drawing a circle with radius " + radius
 *
 * function draw(width, height):
 * print "Drawing a rectangle with width " + width + " and height " + height
 *
 * main:
 * drawer = new ShapeDrawer()
 * drawer.draw(5)
 * drawer.draw(10, 20)
 */

public class MethodOverloading {

    // Method to draw a circle
    public void draw(int radius) {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Overloaded method to draw a rectangle
    public void draw(int width, int height) {
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
    }

    // Another overloaded method to draw a square
    public void draw(double side) {
        System.out.println("Drawing a square with side: " + side);
    }

    public static void main(String[] args) {
        MethodOverloading shape = new MethodOverloading();

        shape.draw(5);         // Calls the method with one int parameter
        shape.draw(10, 20);     // Calls the method with two int parameters
        shape.draw(7.5);       // Calls the method with one double parameter
    }
}

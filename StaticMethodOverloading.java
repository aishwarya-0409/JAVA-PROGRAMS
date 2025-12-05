/*
 * Algorithm for Static Method Overloading
 *
 * 1.  Define a class, e.g., 'Calculator'.
 * 2.  Create multiple static methods with the same name, e.g., 'add()'.
 * 3.  The methods must have different parameters. This difference can be in the number of parameters, their data types, or the order of their data types.
 * 4.  The return type of the methods can be the same or different.
 * 5.  In the 'main' method, call these static methods directly using the class name.
 * 6.  The Java compiler will determine which method to call based on the number and type of arguments passed.
 *
 * Pseudocode
 *
 * class Calculator:
 * static function add(a, b):
 * return a + b
 *
 * static function add(a, b, c):
 * return a + b + c
 *
 * main:
 * result1 = Calculator.add(5, 10)
 * result2 = Calculator.add(5, 10, 15)
 * print result1, result2
 */

public class StaticMethodOverloading {

    // A static method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded static method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Another overloaded static method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Adding two integers: " + StaticMethodOverloading.add(10, 20));
        System.out.println("Adding three integers: " + StaticMethodOverloading.add(10, 20, 30));
        System.out.println("Adding two doubles: " + StaticMethodOverloading.add(10.5, 20.5));
    }
}

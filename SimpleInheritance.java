/*
 * Algorithm for Simple Inheritance
 *
 * 1.  Define a base class (parent), e.g., 'Animal'.
 * 2.  Define methods and variables in the base class that can be inherited, e.g., 'eat()'.
 * 3.  Define a subclass (child), e.g., 'Dog'.
 * 4.  Use the 'extends' keyword to inherit from the base class: 'class Dog extends Animal'.
 * 5.  The subclass now has access to the public and protected members of the base class.
 * 6.  The subclass can also define its own unique methods, e.g., 'bark()'.
 * 7.  In the 'main' method, create an object of the subclass.
 * 8.  Call both the inherited method and the subclass's own method on the subclass object.
 *
 * Pseudocode
 *
 * class Animal:
 * function eat():
 * print "Animal is eating."
 *
 * class Dog extends Animal:
 * function bark():
 * print "Dog is barking."
 *
 * main:
 * myDog = new Dog()
 * myDog.eat()   // Inherited method
 * myDog.bark()  // Subclass's method
 */

// Base class
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass that extends the Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Calling the inherited method from the Animal class
        myDog.eat();

        // Calling the method specific to the Dog class
        myDog.bark();
    }
}

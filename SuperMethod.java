/*
 * Algorithm for Calling Base Class Method with 'super'
 *
 * 1.  Define a base class, e.g., 'Animal', with a method, e.g., 'makeSound()'.
 * 2.  Define a subclass, e.g., 'Dog', that extends the base class.
 * 3.  Override the base class's method in the subclass, providing a new implementation.
 * 4.  Inside the overridden method in the subclass, use 'super.methodName()' to call the original method from the base class.
 * 5.  This allows you to extend the functionality of the parent method rather than completely replacing it.
 * 6.  In the 'main' method, create an object of the subclass and call the overridden method.
 *
 * Pseudocode
 *
 * class Animal:
 * function makeSound():
 * print "Animal makes a sound."
 *
 * class Dog extends Animal:
 * @Override
 * function makeSound():
 * super.makeSound()  // Call parent method
 * print "Woof Woof!"
 *
 * main:
 * myDog = new Dog()
 * myDog.makeSound()
 */

// Base class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        // Call the makeSound() method from the parent class
        super.makeSound();
        System.out.println("The dog says, \"Woof Woof!\"");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}

/*
 * Algorithm for Method Overriding
 *
 * 1.  Define a base class, e.g., 'Vehicle'.
 * 2.  Create a method in the base class, e.g., 'drive()'.
 * 3.  Define a subclass that extends the base class, e.g., 'Car extends Vehicle'.
 * 4.  In the subclass, create a method with the same name, same parameters, and same return type as the base class method. This is overriding.
 * 5.  Use the '@Override' annotation to ensure it is an actual override and to catch any errors.
 * 6.  Provide a new implementation for the method in the subclass.
 * 7.  In the 'main' method, create objects of both the base class and the subclass.
 * 8.  Call the overridden method on both objects to observe the different behaviors.
 *
 * Pseudocode
 *
 * class Vehicle:
 * function drive():
 * print "Vehicle is driving."
 *
 * class Car extends Vehicle:
 * @Override
 * function drive():
 * print "Car is driving smoothly."
 *
 * main:
 * vehicle = new Vehicle()
 * car = new Car()
 * vehicle.drive()
 * car.drive()
 */

// Base class
class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// Subclass that overrides the drive() method
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The car is driving smoothly.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        myVehicle.drive(); // Calls the drive() method from Vehicle
        myCar.drive();     // Calls the overridden drive() method from Car
    }
}

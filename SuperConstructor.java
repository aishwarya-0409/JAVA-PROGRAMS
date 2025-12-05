/*
 * Algorithm for Calling Base Class Constructor with 'super'
 *
 * 1.  Define a base class, e.g., 'Person', with a parameterized constructor.
 * 2.  The constructor should initialize instance variables, e.g., 'name' and 'age'.
 * 3.  Define a subclass, e.g., 'Employee', that extends the base class.
 * 4.  The subclass should have its own constructor, which may take additional parameters, e.g., 'employeeId'.
 * 5.  Inside the subclass's constructor, call the base class constructor using 'super()'. This must be the first statement in the subclass's constructor.
 * 6.  Pass the necessary arguments to 'super()' to initialize the inherited members.
 * 7.  In the 'main' method, create an object of the subclass and observe that both the subclass and base class constructors were executed.
 *
 * Pseudocode
 *
 * class Person:
 * constructor(name):
 * this.name = name
 * print "Person constructor called."
 *
 * class Employee extends Person:
 * constructor(name, employeeId):
 * super(name)  // Call parent constructor
 * this.employeeId = employeeId
 * print "Employee constructor called."
 *
 * main:
 * employee = new Employee("John", 123)
 */

// Base class
class Person {
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor called. Name: " + this.name);
    }
}

// Subclass
class Employee extends Person {
    int employeeId;

    public Employee(String name, int employeeId) {
        // Call the parent class's constructor
        super(name);
        this.employeeId = employeeId;
        System.out.println("Employee constructor called. ID: " + this.employeeId);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101);
        System.out.println("Employee Name: " + emp.name + ", Employee ID: " + emp.employeeId);
    }
}

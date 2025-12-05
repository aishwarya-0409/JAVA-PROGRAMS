/*
 * Algorithm for Factorial Calculation using a Loop
 *
 * 1.  Import the 'java.util.Scanner' class to get user input.
 * 2.  Prompt the user to enter a non-negative number.
 * 3.  Read the number from the user.
 * 4.  Handle the edge case where the number is negative, as factorial is not defined for negative numbers.
 * 5.  Initialize a variable 'factorial' to 1. Use a 'long' data type to prevent integer overflow for larger numbers.
 * 6.  Use a 'for' loop that iterates from 1 up to the entered number.
 * 7.  Inside the loop, multiply the 'factorial' variable by the loop counter `i`.
 * 8.  After the loop, the 'factorial' variable will hold the final result.
 * 9.  Print the result to the console.
 *
 * Pseudocode
 *
 * read num from user
 *
 * if num < 0:
 * print "Factorial not defined."
 * else:
 * factorial = 1
 * for i from 1 to num:
 * factorial = factorial * i
 * print "Factorial of " + num + " is " + factorial
 */

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Use long to handle potentially large factorial values
        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Loop from 1 to the number to calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}

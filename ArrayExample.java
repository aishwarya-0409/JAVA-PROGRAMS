/*
 * Algorithm for using Arrays
 *
 * 1.  Declare an array with a specific size or by initializing it with values.
 * 2.  You can access array elements using their index, which starts from 0.
 * 3.  You can iterate through the array using a standard 'for' loop or an enhanced 'for-each' loop.
 * 4.  In this example, we will calculate the sum and average of the elements in an array.
 * 5.  Initialize a variable 'sum' to 0.
 * 6.  Loop through each element of the array and add its value to 'sum'.
 * 7.  Calculate the average by dividing 'sum' by the total number of elements (array length).
 * 8.  Print the sum and average.
 *
 * Pseudocode
 *
 * array numbers = {10, 20, 30, 40, 50}
 * sum = 0
 *
 * for each number in numbers:
 * sum = sum + number
 *
 * average = sum / numbers.length
 *
 * print "Sum is " + sum
 * print "Average is " + average
 */

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Array elements are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("The sum of the array elements is: " + sum);

        // Calculate the average
        double average = (double) sum / numbers.length;
        System.out.println("The average of the array elements is: " + average);
    }
}

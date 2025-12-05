/*
 * Algorithm for File I/O Streams
 *
 * Part 1: Writing to a File
 *
 * 1.  Define a string of data to be written to a file.
 * 2.  Use a `try-with-resources` block to create a `FileWriter` object, passing the file path. This ensures the stream is automatically closed.
 * 3.  Optionally, wrap the `FileWriter` in a `BufferedWriter` for more efficient writing.
 * 4.  Write the string to the file using the `write()` method.
 * 5.  Print a confirmation message.
 *
 * Part 2: Reading from a File
 *
 * 1.  Use another `try-with-resources` block to create a `FileReader` object, passing the same file path.
 * 2.  Optionally, wrap the `FileReader` in a `BufferedReader` to read the file line by line.
 * 3.  Use a `while` loop to read each line from the `BufferedReader` until `readLine()` returns `null`.
 * 4.  Inside the loop, print the line that was read.
 * 5.  Catch any `IOException` that might occur during file operations.
 *
 * Pseudocode
 *
 * function writeToFile(filename, data):
 * try:
 * writer = new FileWriter(filename)
 * writer.write(data)
 * print "Successfully wrote to file."
 * catch (IOException e):
 * print "An error occurred."
 *
 * function readFromFile(filename):
 * try:
 * reader = new FileReader(filename)
 * while (line = reader.readLine()) != null:
 * print line
 * catch (IOException e):
 * print "An error occurred."
 *
 * main:
 * writeToFile("output.txt", "Hello, World!")
 * readFromFile("output.txt")
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "testfile.txt";
        String dataToWrite = "This is a test line for Java I/O.\nThis is the second line.\n";

        // --- Part 1: Writing to a File ---
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(dataToWrite);
            System.out.println("Successfully wrote data to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        System.out.println("-------------------------");

        // --- Part 2: Reading from a File ---
        System.out.println("Reading data from " + fileName + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}

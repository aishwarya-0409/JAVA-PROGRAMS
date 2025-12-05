/*
 * Algorithm for Multithreading by Extending Thread Class
 *
 * 1.  Create a class that extends the `java.lang.Thread` class.
 * 2.  Override the `run()` method in your class. The code inside this method is what the thread will execute.
 * 3.  In the 'main' method, create instances of your custom thread class.
 * 4.  Call the `start()` method on each thread instance. The `start()` method internally calls the `run()` method, but in a new, separate thread of execution.
 * 5.  The main thread will continue its own execution concurrently with the new threads.
 *
 * Pseudocode
 *
 * class MyThread extends Thread:
 * @Override
 * function run():
 * loop 5 times:
 * print "Thread " + this.getName() + " is running."
 * sleep for 100 milliseconds
 *
 * main:
 * thread1 = new MyThread("Thread-1")
 * thread2 = new MyThread("Thread-2")
 * thread1.start()
 * thread2.start()
 */

// A class that extends the Thread class
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + name + " is running. Iteration: " + (i + 1));
            try {
                // Pause the thread for 100 milliseconds
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating two thread objects
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");

        // Starting the threads
        thread1.start();
        thread2.start();

        // The main thread continues its execution
        System.out.println("Main thread finished.");
    }
}


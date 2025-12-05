import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int count = input.nextInt();
        input.close();

        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci Series of " + count + " terms:");

        if (count >= 1) {
            System.out.print(" " + n1);
        }
        if (count >= 2) {
            System.out.print(" " + n2);
        }

        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

/* ### 1\. Fibonacci Series in Java

A **Fibonacci series** is a sequence where each number is the sum of the two preceding ones.

**Algorithm**

  - Initialize `n1 = 0` and `n2 = 1`.
  - Get the desired number of terms, `count`.
  - Print `n1` and `n2`.
  - Use a loop to iterate from 2 to `count - 1`:
      - Calculate `n3 = n1 + n2`.
      - Print `n3`.
      - Update `n1 = n2` and `n2 = n3`.

**Pseudocode**

```
function fibonacci(count):
  n1 = 0
  n2 = 1
  print n1, n2
  loop i from 2 to count-1:
    n3 = n1 + n2
    print n3
    n1 = n2
    n2 = n3
```
 */


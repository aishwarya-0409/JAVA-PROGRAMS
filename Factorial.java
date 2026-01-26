import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a non-negative number to calculate its factorial: ");
            int num = input.nextInt();

            long factorial = 1;

            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                for (int i = 1; i <= num; ++i) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + num + " is " + factorial);
            }
        }
    }
}

/*  ### 4\. Factorial Program in Java

The **factorial** of a non-negative integer `n` is the product of all positive integers up to `n`.

**Algorithm**

  - Get a non-negative integer, `num`.
  - Initialize `factorial = 1`.
  - Loop from 1 to `num`:
      - `factorial = factorial * i`.
  - The result is stored in `factorial`.

**Pseudocode**

```
function factorial(num):
  if num < 0:
    return error
  factorial = 1
  for i from 1 to num:
    factorial = factorial * i
  return factorial
```

----- */
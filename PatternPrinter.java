import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = input.nextInt();
        input.close();

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*### 7\. How to Print Pattern in Java

Patterns are typically printed using **nested loops**.

**Algorithm**

  - Use an outer loop for the number of **rows**.
  - Use an inner loop for the number of **columns** or characters in each row.
  - Print the desired character inside the inner loop.
  - Print a newline character after the inner loop to move to the next row.

**Pseudocode (for a right-angle triangle)**

```
function printPattern(rows):
  for i from 1 to rows:
    for j from 1 to i:
      print "*"
    print newline
```

----- */
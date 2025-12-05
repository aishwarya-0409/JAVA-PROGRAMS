import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        // Using Math.random() for a random integer between 1 and 100
        int min = 1;
        int max = 100;
        int randomNum1 = (int)(Math.random() * (max - min + 1) + min);
        System.out.println("Random number using Math.random(): " + randomNum1);

        // Using the Random class
        Random rand = new Random();
        int randomNum2 = rand.nextInt(101); // Generates a number from 0 to 100
        System.out.println("Random number using Random class: " + randomNum2);
    }
}

/* ### 6\. How to Generate Random Number in Java

**Algorithm**

  - **Using `Math.random()`**:
      - `(int)(Math.random() * (max - min + 1) + min)` generates an integer in the range `[min, max]`.
  - **Using `java.util.Random` class**:
      - Create a `Random` object: `Random rand = new Random();`.
      - Use `rand.nextInt(bound)` for a random integer from `0` to `bound-1`.
      - For a range `[min, max]`, use `rand.nextInt(max - min + 1) + min`.

**Pseudocode**

```
// Using Math.random()
function generateRandomInt(min, max):
  return (int)(random() * (max - min + 1) + min)

// Using java.util.Random
function generateRandomInt(min, max):
  Random rand = new Random()
  return rand.nextInt(max - min + 1) + min
```

-----  */
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = input.nextInt();
        input.close();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

/* ### 2\. Prime Number Program in Java

A **prime number** is a natural number greater than 1 that has no positive divisors other than 1 and itself.

**Algorithm**

  - Get a number, `num`.
  - Check if `num` is less than or equal to 1. If so, it's not prime.
  - Loop from 2 up to `num / 2`.
  - If `num % i == 0` for any `i`, the number is not prime.
  - If the loop completes without finding a divisor, the number is prime.

**Pseudocode**

```
function isPrime(num):
  if num <= 1:
    return false
  for i from 2 to num/2:
    if num % i == 0:
      return false
  return true
```

----- */
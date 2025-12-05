import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = input.nextInt();
        input.close();

        int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();
        int tempNum = num;

        while (tempNum != 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, numberOfDigits);
            tempNum /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

/* ## 5\. Armstrong Number in Java

An **Armstrong number** is a number equal to the sum of its digits, each raised to the power of the number of digits.

**Algorithm**

  - Get a number, `num`, and store it in `originalNum`.
  - Count the number of digits.
  - Initialize `sum = 0`.
  - Use a `while` loop until `num` is 0:
      - Get the last digit.
      - Add the digit raised to the power of the number of digits to `sum`.
      - Remove the last digit.
  - Compare `sum` with `originalNum`.

**Pseudocode**

```
function isArmstrong(num):
  originalNum = num
  numberOfDigits = countDigits(num)
  sum = 0
  tempNum = num
  while tempNum > 0:
    digit = tempNum % 10
    sum = sum + power(digit, numberOfDigits)
    tempNum = tempNum / 10
  if sum == originalNum:
    return true
  else:
    return false
```

----- */
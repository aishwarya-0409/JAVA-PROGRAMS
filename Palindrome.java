import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int num = input.nextInt();
        input.close();

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}

/*      ### 3\. Palindrome Program in Java

    A **palindrome** is a number that reads the same backward as forward.

    **Algorithm**

    - Get a number, `num`, and store it in `originalNum`.
    - Initialize `reversedNum = 0`.
    - Use a `while` loop until `num` is 0:
        - Get the last digit: `digit = num % 10`.
        - Update `reversedNum`: `reversedNum = reversedNum * 10 + digit`.
        - Remove the last digit: `num = num / 10`.
    - Compare `originalNum` and `reversedNum`. If they are equal, it's a palindrome.

    **Pseudocode**

    ```
    function isPalindrome(num):
    originalNum = num
    reversedNum = 0
    while num > 0:
        digit = num % 10
        reversedNum = reversedNum * 10 + digit
        num = num / 10
    if originalNum == reversedNum:
        return true
    else:
        return false
    ```

    ----- */
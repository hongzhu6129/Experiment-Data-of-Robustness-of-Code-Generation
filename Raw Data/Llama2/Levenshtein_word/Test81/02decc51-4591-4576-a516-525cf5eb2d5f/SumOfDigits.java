import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        int tempSum = sum;
        while (tempSum > 0) {
            print_number(tempSum % 10);
            tempSum /= 10;
            if (tempSum > 0) {  // Add space between words unless it's the last digit
                System.out.print(" ");
            }
        }
        System.out.println(); // Newline for cleaner output
        input.close();
    }

    public static void print_number(int digit) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (digit >= 0 && digit <= 9) {
            System.out.print(words[digit]);
        } else {
            System.out.print("Invalid digit"); // Handle potential errors gracefully (though the code ensures it won't reach here normally)
        }
    }
}

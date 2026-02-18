import java.util.Scanner;

public class SumOfDigitsInEnglish {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();

        int sumOfDigits = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        System.out.print("Sum of digits: " + sumOfDigits + "\nIn English: ");
        int tempSum = sumOfDigits;
        while (tempSum > 0) {
            print_number(tempSum % 10);
            tempSum /= 10;
            if (tempSum > 0) { // Add spaces between words unless it's the last digit
                System.out.print(" ");
            }
        }

        System.out.println(); // Newline for clarity
    }

    public static void print_number(int digit) {
        String[] englishDigits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (digit >= 0 && digit <= 9) {
            System.out.print(englishDigits[digit]);
        } else {
            System.out.print("Invalid digit"); // Handle unexpected inputs (though the code logic makes this unlikely)
        }
    }
}

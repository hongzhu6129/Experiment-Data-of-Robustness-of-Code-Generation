import java.util.Scanner;

public class SumOfDigitsInEnglish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sumOfDigits);

        int tempSum = sumOfDigits;
        while (tempSum > 0) {
            print_number(tempSum % 10);
            tempSum /= 10;
            if(tempSum>0) {  // Avoid trailing space
                System.out.print(" "); 
            }
        }
        System.out.println(); // Newline for clarity
        scanner.close();
    }


    public static void print_number(int digit) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (digit >= 0 && digit <= 9) {
            System.out.print(words[digit]);
        } else {
            System.out.print("Invalid digit"); // Handle unexpected input
        }
    }
}

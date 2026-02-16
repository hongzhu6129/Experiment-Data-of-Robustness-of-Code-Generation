import java.util.Scanner;

public class AddDigitsUntilOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = add_digits_until_one(num);
            System.out.println("The final single-digit result is: " + result);
        }
        scanner.close(); 
    }

    public static int add_digits_until_one(int num) {
        while (num >= 10) { // Continue until num is a single digit
            int sum = 0;
            while (num > 0) {  // Add up all digits of num
                sum += num % 10;
                num /= 10;
            }
            num = sum;        // Update num with the sum
        }
        return num; 
    }
}

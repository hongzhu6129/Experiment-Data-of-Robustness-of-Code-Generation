import java.util.Scanner;

public class AddDigitsUntilOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int result = add_digits_until_one(num);
            System.out.println("Result: " + result);
        }
        scanner.close(); 
    }

    public static int add_digits_until_one(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        temp = sum;
        while (temp > 0) {
            print_number(temp % 10);
            temp /= 10;
            if (temp > 0) { // Add a space between words if there are more digits
                System.out.print(" "); 
            }
        }
        System.out.println(); // Newline at the end

        scanner.close();
    }



    public static void print_number(int digit) {
        switch (digit) {
            case 0:
                System.out.print("zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            default:
                System.out.print("Invalid digit"); // Should not happen
        }
    }
}

import java.util.Scanner;

public class LargestOfTwo {

    public static int findLargest(int num1, int num2) {
        return Math.max(num1, num2); // Using Math.max for simplicity and efficiency
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int largest = findLargest(num1, num2);
        System.out.println("The largest number is: " + largest);

        scanner.close(); 
    }
}

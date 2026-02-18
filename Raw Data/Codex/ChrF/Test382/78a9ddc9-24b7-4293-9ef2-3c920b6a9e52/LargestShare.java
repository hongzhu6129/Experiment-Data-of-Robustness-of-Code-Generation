import java.util.Scanner;

public class LargestShare {

    public static int findLargestShare(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int largest = findLargestShare(num1, num2);
        System.out.println("The largest share is: " + largest);

        scanner.close();
    }
}

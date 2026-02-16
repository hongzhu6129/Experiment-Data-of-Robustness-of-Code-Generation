import java.util.Scanner;

public class ReturnTwoIntegers {

    public static int[] getTwoIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[2];

        System.out.print("Enter the first integer: ");
        values[0] = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        values[1] = scanner.nextInt();

        scanner.close(); // Close the scanner to release resources
        return values;
    }

    public static void main(String[] args) {
        int[] returnedValues = getTwoIntegers();
        System.out.println("The entered values are: " + returnedValues[0] + " and " + returnedValues[1]);
    }
}

import java.util.Scanner;

public class ChangeLargest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            num1 = num2; // Change the largest (num1) to the smaller value (num2)
        } else if (num2 > num1) {
            num2 = num1; // Change the largest (num2) to the smaller value (num1)
        } // If they are equal, no change is needed


        System.out.println("Modified values: num1 = " + num1 + ", num2 = " + num2);
        scanner.close();
    }
}

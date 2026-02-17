import java.util.Scanner;

public class CompareFourIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        System.out.print("Input third number: ");
        int num3 = input.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = input.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("numbers are not equal!");
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}

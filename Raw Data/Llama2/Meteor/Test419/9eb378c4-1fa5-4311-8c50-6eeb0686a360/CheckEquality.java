import java.util.Scanner;

public class CheckEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("equal");
        } else {
            System.out.println("numbers are not equal!");
        }

        scanner.close(); 
    }
}

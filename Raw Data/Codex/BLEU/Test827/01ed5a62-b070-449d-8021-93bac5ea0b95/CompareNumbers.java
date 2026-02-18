import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int num1 = input.nextInt();

        System.out.print("Input second integer: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " != " + num2);

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " = " + num2); // Added equality check for completeness
        }

        System.out.println(num1 + " <= " + num2);


        input.close();
    }
}

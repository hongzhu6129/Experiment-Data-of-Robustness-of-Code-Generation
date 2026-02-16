import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int number1 = input.nextInt();

        System.out.print("Input second integer: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
            System.out.println(number1 + " <= " + number2); // Added this line as per the example output.
        } else { // number1 > number2
            System.out.println(number1 + " != " + number2);  // Added this based on example
            System.out.println(number1 + " > " + number2);
            System.out.println(number1 + " >= " + number2); // Added this for completeness.
        }

        input.close(); 
    }
}

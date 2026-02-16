import java.util.Scanner;

public class FractionOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numerator of the first fraction:");
        int num1 = input.nextInt();

        System.out.println("Enter the denominator of the first fraction:");
        int den1 = input.nextInt();

        // Input validation for denominator (cannot be zero)
        if (den1 == 0) {
            System.out.println("Denominator cannot be zero. Exiting.");
            return; 
        }


        System.out.println("Enter the numerator of the second fraction:");
        int num2 = input.nextInt();

        System.out.println("Enter the denominator of the second fraction:");
        int den2 = input.nextInt();

        // Input validation for denominator (cannot be zero)
        if (den2 == 0) {
            System.out.println("Denominator cannot be zero. Exiting.");
            return;
        }

        // Addition
        int addNum = num1 * den2 + num2 * den1;
        int addDen = den1 * den2;
        System.out.println("Addition: " + addNum + "/" + addDen);


        // Subtraction
        int subNum = num1 * den2 - num2 * den1;
        int subDen = den1 * den2;
        System.out.println("Subtraction: " + subNum + "/" + subDen);

        // Multiplication
        int mulNum = num1 * num2;
        int mulDen = den1 * den2;
        System.out.println("Multiplication: " + mulNum + "/" + mulDen);

        // Division
        if (num2 == 0) { // Handle division by zero
            System.out.println("Division by zero error.");
        } else {
            int divNum = num1 * den2;
            int divDen = den1 * num2;
            System.out.println("Division: " + divNum + "/" + divDen);
        }


        // Remainder (for fractions, we'll interpret this as the remainder of the numerators when the denominators are equalized)
        int remainderNum = (num1*den2) % (num2*den1); //Remainder of scaled numerators.
        int remainderDen = den1*den2; // Common denominator
        System.out.println("Remainder: " + remainderNum + "/" + remainderDen );


        input.close();
    }

    // Optional:  A function to simplify fractions (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}





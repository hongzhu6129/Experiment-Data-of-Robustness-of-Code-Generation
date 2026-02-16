import java.util.Scanner;

public class FractionOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numerator of the first fraction: ");
        int num1 = input.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int den1 = input.nextInt();

        System.out.print("Enter the numerator of the second fraction: ");
        int num2 = input.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int den2 = input.nextInt();


        // Input validation: denominators cannot be zero.
        if (den1 == 0 || den2 == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            return; // Exit the program if denominator is zero.
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
        if (num2 == 0) { // Check for division by zero
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int divNum = num1 * den2;
            int divDen = den1 * num2;
            System.out.println("Division: " + divNum + "/" + divDen);
        }



        // Remainder (for fractions, we'll compute remainder of numerators after making denominators equal).
        int remNum = (num1*den2) % (num2*den1);
        int remDen = den1*den2;

        System.out.println("Remainder of numerators after equalizing denominators: " + remNum + "/" + remDen);
        

        input.close();
    }

    // Optional: You can add a function to simplify fractions (e.g., using GCD). 
}

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


        if (den1 == 0 || den2 == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            return;
        }


        // Addition
        int addNum = num1 * den2 + num2 * den1;
        int addDen = den1 * den2;
        System.out.println("Addition: " + addNum + "/" + addDen + " = " + simplify(addNum, addDen));

        // Subtraction
        int subNum = num1 * den2 - num2 * den1;
        int subDen = den1 * den2;
        System.out.println("Subtraction: " + subNum + "/" + subDen + " = " + simplify(subNum, subDen));

        // Multiplication
        int mulNum = num1 * num2;
        int mulDen = den1 * den2;
        System.out.println("Multiplication: " + mulNum + "/" + mulDen + " = " + simplify(mulNum, mulDen));


        // Division
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int divNum = num1 * den2;
            int divDen = den1 * num2;
            System.out.println("Division: " + divNum + "/" + divDen + " = " + simplify(divNum, divDen));
        }
        
        //Remainder (for fractions, this is usually interpreted as the remainder of the numerators after dividing)
        if(num2 == 0) {
             System.out.println("Error: Cannot calculate remainder with a divisor of zero.");

        } else {
            int remNum = num1 % num2;
            System.out.println("Remainder of numerators : " + remNum );
        }
      input.close();
    }

    // Helper function to simplify fractions using GCD
    public static String simplify(int num, int den) {
        int gcd = findGCD(num, den);
        int simplifiedNum = num / gcd;
        int simplifiedDen = den / gcd;


        if (simplifiedDen == 1) {
            return String.valueOf(simplifiedNum); // Return whole number if denominator is 1
        }
        return simplifiedNum + "/" + simplifiedDen;
    }



    // Helper function to find the Greatest Common Divisor (GCD)
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }


}


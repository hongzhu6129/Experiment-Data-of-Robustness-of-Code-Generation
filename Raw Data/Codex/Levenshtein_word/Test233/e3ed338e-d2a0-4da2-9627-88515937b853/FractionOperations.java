import java.util.Scanner;

public class FractionOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator of the first fraction:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the denominator of the first fraction:");
        int den1 = scanner.nextInt();

        System.out.println("Enter the numerator of the second fraction:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the denominator of the second fraction:");
        int den2 = scanner.nextInt();


        // Validate denominators (cannot be zero)
        if (den1 == 0 || den2 == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            return;
        }

        // Addition
        int addNum = num1 * den2 + num2 * den1;
        int addDen = den1 * den2;
        System.out.println("Addition: " + addNum + "/" + addDen + " = " + simplify(addNum,addDen));

        // Subtraction
        int subNum = num1 * den2 - num2 * den1;
        int subDen = den1 * den2;
        System.out.println("Subtraction: " + subNum + "/" + subDen+ " = " + simplify(subNum,subDen));

        // Multiplication
        int mulNum = num1 * num2;
        int mulDen = den1 * den2;
        System.out.println("Multiplication: " + mulNum + "/" + mulDen+ " = " + simplify(mulNum,mulDen));

        // Division
        if (num2 == 0) { // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
            return;
        }
        int divNum = num1 * den2;
        int divDen = den1 * num2;
        System.out.println("Division: " + divNum + "/" + divDen+ " = " + simplify(divNum,divDen));

        //Remainder (for integers from fractions. Note: True fraction remainder is less useful)
        if(den1!=1 || den2 !=1){
            System.out.println("Note: Remainder is calculated using the simplified integer values obtained by dividing numerator by denominator.");
        }

        int int1 = num1 / den1;
        int int2 = num2 / den2;
        int remainder = int1 % int2;
        System.out.println("Remainder (of integer parts): " + remainder);

        scanner.close();
    }

     // Helper function to simplify fractions (GCD)
      public static String simplify(int num, int den){
           int gcd = findGCD(num,den);
           return (num/gcd)+ "/" + (den/gcd);
      }

     public static int findGCD(int a, int b) {
            if (b == 0) {
                return a;
            }
            return findGCD(b, a % b);
        }

}

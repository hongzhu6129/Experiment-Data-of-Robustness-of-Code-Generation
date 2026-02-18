import java.util.Scanner;

public class ModulusWithoutOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        if (num2 == 0) {
            System.out.println("Cannot divide by zero."); // Handle division by zero
            return; // Exit to avoid further calculations
        }

        // Using repeated subtraction to mimic modulus
        int result = num1;
        while (result >= num2) {
            result -= num2;
        }
        
        System.out.println(result);

        input.close(); 
    }
}

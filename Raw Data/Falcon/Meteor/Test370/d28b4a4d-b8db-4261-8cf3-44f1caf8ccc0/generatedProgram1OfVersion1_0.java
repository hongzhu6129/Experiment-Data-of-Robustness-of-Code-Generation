import java.util.Scanner;

public class AverageOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3.0; // Use 3.0 for floating-point division

        System.out.println("The average is: " + average);

        scanner.close(); 
    }
}

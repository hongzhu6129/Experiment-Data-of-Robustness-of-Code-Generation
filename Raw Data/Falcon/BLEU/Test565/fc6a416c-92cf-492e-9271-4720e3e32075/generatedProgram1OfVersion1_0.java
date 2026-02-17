import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Input the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Input the third number: ");
        double num3 = input.nextDouble();

        double smallest = smallest(num1, num2, num3);

        System.out.println("The smallest value is " + smallest);
        input.close(); 
    }

    public static double smallest(double num1, double num2, double num3) {
        double smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }
}

import java.util.Scanner;

public class CheckRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = input.nextDouble();

        System.out.print("Input second number: ");
        double num2 = input.nextDouble();

        boolean result = (num1 > 0 && num1 < 1) && (num2 > 0 && num2 < 1);

        System.out.println(result);

        input.close(); 
    }
}

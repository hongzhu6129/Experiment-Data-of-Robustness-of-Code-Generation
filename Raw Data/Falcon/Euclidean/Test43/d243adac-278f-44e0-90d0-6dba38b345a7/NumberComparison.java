import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number : ");
        int num3 = input.nextInt();

        boolean abc = false; // You can change this value to test different scenarios

        boolean result = test(num1, num2, num3, abc);
        System.out.println("The result is: " + result);

        input.close(); 
    }

    public static boolean test(int num1, int num2, int num3, boolean abc) {
        if (abc) {
            return num3 > num2;
        } else {
            return num2 > num1 && num3 > num2;
        }
    }
}

import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        boolean result = sumoftwo(num1, num2, num3);
        System.out.println("The result is: " + result);
        scanner.close();

    }

    public static boolean sumoftwo(int a, int b, int c) {
        return a + b == c;
    }
}

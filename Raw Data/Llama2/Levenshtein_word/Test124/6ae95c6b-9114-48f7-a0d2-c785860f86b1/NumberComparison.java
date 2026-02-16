import java.util.Scanner;

public class NumberComparison {

    public static boolean checkNumbers(int a, int b, int c, boolean abc) {
        if (abc) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Is 'abc' true? (true/false)");
        boolean abc = scanner.nextBoolean();

        boolean result = checkNumbers(num1, num2, num3, abc);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

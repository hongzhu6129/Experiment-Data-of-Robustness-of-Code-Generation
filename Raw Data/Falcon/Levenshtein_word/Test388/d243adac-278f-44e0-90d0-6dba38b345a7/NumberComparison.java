import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        boolean abc = "abc".equals("abc"); // This will always be true

        boolean result = (abc || (num2 > num1)) && (num3 > num2);

        System.out.println(result);

        scanner.close(); 
    }
}

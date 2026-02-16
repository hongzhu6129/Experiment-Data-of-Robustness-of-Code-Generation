import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        boolean result = sumoftwo(num1, num2, num3);
        System.out.println("The result is: " + result);

        input.close(); 
    }

    public static boolean sumoftwo(int a, int b, int c) {
        return (a + b) == c;
    }
}

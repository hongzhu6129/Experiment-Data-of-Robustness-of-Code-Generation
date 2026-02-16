import java.util.Scanner;

class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();


        System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));

        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));

        System.out.println(num1 + " x " + num2 + " = " + multiply(num1, num2));

        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));

        System.out.println(num1 + " mod " + num2 + " = " + remainder(num1, num2));

         input.close();
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
}

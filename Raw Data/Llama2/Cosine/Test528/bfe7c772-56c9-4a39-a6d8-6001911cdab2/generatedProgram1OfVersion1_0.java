import java.util.Scanner;

public class TwentyLess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        boolean result = checkTwentyLess(num1, num2, num3);
        System.out.println(result);

        input.close(); 
    }

    private static boolean checkTwentyLess(int num1, int num2, int num3) {
        int diff1 = Math.abs(num1 - (num2 - num3));  //Use Math.abs to handle different subtraction orders.
        int diff2 = Math.abs(num2 - (num1 - num3));
        int diff3 = Math.abs(num3 - (num1- num2));


        return diff1 >= 20 || diff2 >= 20 || diff3 >= 20;
    }
}

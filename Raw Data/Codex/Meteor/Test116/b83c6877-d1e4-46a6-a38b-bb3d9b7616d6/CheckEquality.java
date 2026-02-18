import java.util.Scanner;

public class CheckEquality {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        System.out.print("Input third number: ");
        int num3 = input.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = input.nextInt();


        System.out.print("Input fifth number: ");
        int num5 = input.nextInt();

        System.out.print("Input sixth number: ");
        int num6 = input.nextInt();


        System.out.print("Input seventh number: ");
        int num7 = input.nextInt();


        if (num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5 && num5 == num6 && num6 == num7) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("numbers are not equal!");
        }

        input.close(); 
    }
}

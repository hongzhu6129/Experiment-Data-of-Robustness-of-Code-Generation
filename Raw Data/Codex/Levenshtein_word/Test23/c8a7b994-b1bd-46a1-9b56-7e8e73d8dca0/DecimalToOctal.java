import java.util.Scanner;

public class DecimalToOctal {

    public static int functionone(int decimal) {
        int octal = 0;
        int power = 1;

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal += remainder * power;
            decimal /= 8;
            power *= 10;
        }
        return octal;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        int octal = functionone(decimal);
        System.out.println("Octal number is: " + octal);
        input.close();
    }
}

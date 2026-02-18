import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Hexadecimal number is: " + hexadecimal);

        input.close(); // Close the scanner to release resources. 
    }
}

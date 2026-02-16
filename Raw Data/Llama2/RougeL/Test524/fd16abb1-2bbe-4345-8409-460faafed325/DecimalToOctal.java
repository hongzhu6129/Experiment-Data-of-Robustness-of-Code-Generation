import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a numeral number: ");
        int decimal = input.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number is: " + octal);

        input.close(); // Close the scanner to prevent resource leaks
    }
}

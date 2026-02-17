import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = input.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number is: " + octal);
        input.close();
    }
}

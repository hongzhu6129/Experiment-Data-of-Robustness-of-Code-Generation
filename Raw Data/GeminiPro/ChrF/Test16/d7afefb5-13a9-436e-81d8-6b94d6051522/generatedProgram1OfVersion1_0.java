import java.util.Scanner;

public class DecimalToOctal {

    public static String functionone(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a numeral number: ");
        int decimal = input.nextInt();

        String octal = functionone(decimal);
        System.out.println("Octal number is: " + octal);
        input.close(); 
    }
}

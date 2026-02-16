import java.util.Scanner;

public class DecimalToOctal {

    public static String functionone(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Insert at the beginning for correct order
            decimal /= 8;
        }
        return (octal.length() == 0) ? "0" : octal.toString(); // Handle the case of input 0
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the decimal number: ");
        int decimal = input.nextInt();

        String octal = functionone(decimal);
        System.out.println("Octal number is: " + octal);
        input.close();
    }
}

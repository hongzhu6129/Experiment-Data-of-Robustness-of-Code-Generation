import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal); // Direct conversion using built-in method

        System.out.println("Binary number is: " + binary);

        input.close(); 
    }
}

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any decimal number: ");
        int decimal = input.nextInt();

        // Using Integer.toBinaryString() for simplicity and efficiency
        String binary = Integer.toBinaryString(decimal); 

        System.out.println("Equivalent binary number: " + binary);
        input.close();

    }
}

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any decimal number: ");
        int decimal = input.nextInt();

        // Using built-in Integer.toBinaryString()
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Equivalent binary number: " + binary);


         //Alternative method using manual conversion (for demonstration):
         /*
        if (decimal == 0) {
            System.out.println("Equivalent binary number: 0");
            return; 
        }

        String binaryManual = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryManual = remainder + binaryManual; // Prepend the remainder
            decimal = decimal / 2;
        }

        System.out.println("Equivalent binary number (manual): " + binaryManual); 
        */

        input.close(); 
    }
}

import java.util.Scanner;

public class HexToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase();

        String binaryString = "";
        boolean isValidHex = true;


        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            String binaryDigit;

            switch (hexChar) {
                case '0': binaryDigit = "0000"; break;
                case '1': binaryDigit = "0001"; break;
                case '2': binaryDigit = "0010"; break;
                case '3': binaryDigit = "0011"; break;
                case '4': binaryDigit = "0100"; break;
                case '5': binaryDigit = "0101"; break;
                case '6': binaryDigit = "0110"; break;
                case '7': binaryDigit = "0111"; break;
                case '8': binaryDigit = "1000"; break;
                case '9': binaryDigit = "1001"; break;
                case 'A': binaryDigit = "1010"; break;
                case 'B': binaryDigit = "1011"; break;
                case 'C': binaryDigit = "1100"; break;
                case 'D': binaryDigit = "1101"; break;
                case 'E': binaryDigit = "1110"; break;
                case 'F': binaryDigit = "1111"; break;
                default: 
                    isValidHex = false; 
                    binaryDigit = ""; // Or handle the invalid character in some other way.
                    break;
            }

            if (!isValidHex) {
                break; // Exit the loop if an invalid character is found
            }
            binaryString += binaryDigit; 
        }

        if (isValidHex) {
             System.out.println("Binary equivalent: " + binaryString);
        } else {
            System.out.println("Invalid hexadecimal input.");
        }


        scanner.close();
    }
}

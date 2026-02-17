import java.util.Scanner;

public class HexToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase();

        String binaryString = "";

        try {
            for (int i = 0; i < hexString.length(); i++) {
                char hexChar = hexString.charAt(i);
                switch (hexChar) {
                    case '0': binaryString += "0000"; break;
                    case '1': binaryString += "0001"; break;
                    case '2': binaryString += "0010"; break;
                    case '3': binaryString += "0011"; break;
                    case '4': binaryString += "0100"; break;
                    case '5': binaryString += "0101"; break;
                    case '6': binaryString += "0110"; break;
                    case '7': binaryString += "0111"; break;
                    case '8': binaryString += "1000"; break;
                    case '9': binaryString += "1001"; break;
                    case 'A': binaryString += "1010"; break;
                    case 'B': binaryString += "1011"; break;
                    case 'C': binaryString += "1100"; break;
                    case 'D': binaryString += "1101"; break;
                    case 'E': binaryString += "1110"; break;
                    case 'F': binaryString += "1111"; break;
                    default:
                        System.out.println("Invalid hexadecimal input.");
                        return; // Exit if invalid character found
                }
            }

            System.out.println("Binary equivalent: " + binaryString);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

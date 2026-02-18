public class BinaryToHexadecimal {

    public static void main(String[] args) {
        String binaryNumber = "1101"; // Example binary number
        try {
            int decimal = Integer.parseInt(binaryNumber, 2);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();
            System.out.println("HexaDecimal value: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }

         //Interactive version:
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binaryInput = scanner.nextLine();
        try {
            int decimalInput = Integer.parseInt(binaryInput, 2);
            String hexadecimalInput = Integer.toHexString(decimalInput).toUpperCase();
            System.out.println("HexaDecimal value: " + hexadecimalInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }
        scanner.close(); 
    }
}

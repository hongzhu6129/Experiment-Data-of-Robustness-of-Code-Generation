public class DecimalToHex {

    public static void main(String[] args) {
        int decimalNumber = 15; // You can modify this value or take input from the user
        String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Hexadecimal number is : " + hexadecimalNumber);


        // Example with user input:
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimalInput = scanner.nextInt();
        String hexOutput = Integer.toHexString(decimalInput).toUpperCase();
        System.out.println("Hexadecimal number is : " + hexOutput);
        scanner.close();
    }
}

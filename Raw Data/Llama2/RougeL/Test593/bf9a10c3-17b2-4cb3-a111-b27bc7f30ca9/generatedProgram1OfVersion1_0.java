public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimalNumber = 15; // You can change this value or take input from the user

        String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Hexadecimal number is : " + hexadecimalNumber); 

        // Example with user input (requires exception handling for non-integer input):
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        try {
            int inputDecimal = scanner.nextInt();
            String inputHex = Integer.toHexString(inputDecimal).toUpperCase();
            System.out.println("Hexadecimal number is : " + inputHex);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close(); 
        */
    }
}

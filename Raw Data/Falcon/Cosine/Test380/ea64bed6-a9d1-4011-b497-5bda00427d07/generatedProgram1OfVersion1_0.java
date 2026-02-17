public class BinaryToOctal {

    public static void main(String[] args) {
        String binaryString = "111"; // Example input, can be modified or taken from user input

        try {
            int decimal = Integer.parseInt(binaryString, 2); // Convert binary to decimal
            String octalString = Integer.toOctalString(decimal); // Convert decimal to octal

            System.out.println("Octal number: " + octalString);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
        }
    }
}

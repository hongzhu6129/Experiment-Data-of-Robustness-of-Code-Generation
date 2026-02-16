public class OctalToDecimal {

    public static void main(String[] args) {
        String octalString = "10"; // Replace with user input if needed

        try {
            int decimal = Integer.parseInt(octalString, 8);
            System.out.println("Equivalent decimal number: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number format.");
        }
    }
}

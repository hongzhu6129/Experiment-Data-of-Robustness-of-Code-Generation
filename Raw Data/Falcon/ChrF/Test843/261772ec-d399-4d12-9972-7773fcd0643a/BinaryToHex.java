public class BinaryToHex {

    public static void main(String[] args) {
        String binaryNumber = "1101"; // Replace with user input if needed

        try {
            int decimal = Integer.parseInt(binaryNumber, 2);
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("HexaDecimal value: " + hex);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number format.");
        }
    }
}

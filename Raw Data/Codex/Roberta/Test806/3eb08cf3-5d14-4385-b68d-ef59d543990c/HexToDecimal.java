public class HexToDecimal {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java HexToDecimal <hex_string>");
            return;
        }

        String hexString = args[0].toUpperCase(); // Handle both upper and lowercase

        long decimalValue = 0;
        long power = 1;

        try {
            for (int i = hexString.length() - 1; i >= 0; i--) {
                char hexChar = hexString.charAt(i);

                if (hexChar >= '0' && hexChar <= '9') {
                    decimalValue += (hexChar - '0') * power;
                } else if (hexChar >= 'A' && hexChar <= 'F') {
                    decimalValue += (hexChar - 'A' + 10) * power;
                } else {
                    System.out.println("Invalid hexadecimal character: " + hexChar);
                    return; // Exit on invalid input
                }
                power *= 16;
            }

            System.out.println(decimalValue); 

        } catch (NumberFormatException e) { // For extremely large hex strings that might cause overflow.
            System.out.println("Input is too large to represent as a long.");
        }

    }
}

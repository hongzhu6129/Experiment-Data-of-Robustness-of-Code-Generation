public class OctalToByte {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage: java OctalToByte <octalNumber>");
            return;
        }

        String octalStr = args[0];

        try {
            // Check for invalid characters (anything other than 0-7)
            for (char c : octalStr.toCharArray()) {
                if (c < '0' || c > '7') {
                    throw new NumberFormatException("Invalid octal digit: " + c);
                }
            }


            // Parse octal string to an integer
            int octal = Integer.parseInt(octalStr, 8);

            // Check if the octal number can fit into a byte
            if (octal < Byte.MIN_VALUE || octal > Byte.MAX_VALUE) {
                throw new NumberFormatException("Octal number out of range for byte.");
            }

            // Convert integer to byte
            byte byteValue = (byte) octal;

            System.out.println("Octal: " + octalStr + ", Byte: " + byteValue);

        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

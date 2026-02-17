public class HexToOctal {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HexToOctal <hex_value>");
            return;
        }

        String hexString = args[0];

        try {
            long decimalValue = 0;
            for (int i = 0; i < hexString.length(); i++) {
                char hexChar = hexString.charAt(i);
                int digitValue;

                if (hexChar >= '0' && hexChar <= '9') {
                    digitValue = hexChar - '0';
                } else if (hexChar >= 'A' && hexChar <= 'F') {
                    digitValue = hexChar - 'A' + 10;
                } else if (hexChar >= 'a' && hexChar <= 'f') {
                    digitValue = hexChar - 'a' + 10;
                } else {
                    System.out.println("Invalid hexadecimal character: " + hexChar);
                    return;
                }

                decimalValue = decimalValue * 16 + digitValue;
            }



            String octalString = "";
            if (decimalValue == 0) {
                octalString = "0"; // Special case for input 0
            } else {
                while (decimalValue > 0) {
                   octalString = (decimalValue % 8) + octalString;
                    decimalValue /= 8;
                }
            }



            System.out.println(octalString);


        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal input.");
        }


    }
}

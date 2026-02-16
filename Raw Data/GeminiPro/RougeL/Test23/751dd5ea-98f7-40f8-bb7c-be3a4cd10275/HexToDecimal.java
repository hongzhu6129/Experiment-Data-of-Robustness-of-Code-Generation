public class HexToDecimal {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java HexToDecimal <hex_value>");
            return;
        }

        String hexString = args[0];
        long decimalValue = 0;
        long power = 1;


        for (int i = hexString.length() - 1; i >= 0; i--) {
            char hexChar = hexString.charAt(i);

            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue += (hexChar - '0') * power;
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                decimalValue += (hexChar - 'A' + 10) * power;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                decimalValue += (hexChar - 'a' + 10) * power;
            } else {
                System.out.println("Invalid hexadecimal character: " + hexChar);
                return;
            }

            power *= 16;
        }

        System.out.println(decimalValue);

    }
}

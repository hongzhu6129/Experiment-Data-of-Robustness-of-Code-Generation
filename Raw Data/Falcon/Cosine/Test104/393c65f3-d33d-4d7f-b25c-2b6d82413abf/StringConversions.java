public class StringConversions {

    public static void main(String[] args) {

        String str = "12345";
        String decimalStr = "12345.6789";
        String longStr = "9223372036854775807"; // Max long value

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer: " + intValue);

            long longValue = Long.parseLong(longStr);
            System.out.println("Long: " + longValue);
            
            // Demonstrating parsing part of a long string that might exceed the max long value
            longValue = Long.parseLong(longStr.substring(0, 18)); //  Parse a portion
            System.out.println("Part of Long String as Long: " + longValue);

            float floatValue = Float.parseFloat(decimalStr);
            System.out.println("Float: " + floatValue);

            double doubleValue = Double.parseDouble(decimalStr);
            System.out.println("Double: " + doubleValue);


        } catch (NumberFormatException e) {
            System.err.println("Error converting string: " + e.getMessage());
        }


        // Handling invalid strings (demonstration)
        String invalidStr = "abc"; // Cannot be converted to a number
        try {
            int invalidInt = Integer.parseInt(invalidStr); 
        } catch (NumberFormatException e) {
            System.err.println("Cannot convert \"" + invalidStr + "\" to an integer.");
        }

         String veryLongStr = "9999999999999999999999"; // Exceeds long max value
        try {
            long invalidLong = Long.parseLong(veryLongStr); 
        } catch (NumberFormatException e) {
            System.err.println("Cannot convert \"" + veryLongStr + "\" to a long.");
        }



    }
}

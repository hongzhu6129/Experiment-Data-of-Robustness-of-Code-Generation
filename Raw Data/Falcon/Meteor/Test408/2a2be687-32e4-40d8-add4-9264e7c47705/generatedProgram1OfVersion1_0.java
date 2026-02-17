public class StringConversions {

    public static void main(String[] args) {
        String numStr = "12345";
        String floatStr = "123.45";
        String doubleStr = "67890.12345";

        try {
            // String to int
            int numInt = Integer.parseInt(numStr);
            System.out.println("String to int: " + numInt);

            // String to long
            long numLong = Long.parseLong(numStr);
            System.out.println("String to long: " + numLong);

            // String to float
            float numFloat = Float.parseFloat(floatStr);
            System.out.println("String to float: " + numFloat);

            // String to double
            double numDouble = Double.parseDouble(doubleStr);
            System.out.println("String to double: " + numDouble);

        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }


        // Demonstrating more robust error handling (Optional - but good practice)

         String invalidNumStr = "abc";

        try {
             int invalidInt = Integer.parseInt(invalidNumStr); //This will throw an exception
        } catch (NumberFormatException e) {
            System.err.println("Cannot convert \"" + invalidNumStr + "\" to int.");

        }
    }
}

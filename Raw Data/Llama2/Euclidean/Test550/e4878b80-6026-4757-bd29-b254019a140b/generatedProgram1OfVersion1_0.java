public class StringConversions {

    public static void main(String[] args) {

        String str = "12345";
        String floatStr = "3.14159";
        String longStr = "9876543210";

        try {
            // String to int
            int intValue = Integer.parseInt(str);
            System.out.println("String to int: " + intValue);

            // String to long
            long longValue = Long.parseLong(longStr);
            System.out.println("String to long: " + longValue);

            // String to float
            float floatValue = Float.parseFloat(floatStr);
            System.out.println("String to float: " + floatValue);

            // String to double (straight, assuming this means double in the prompt)
            double doubleValue = Double.parseDouble(floatStr); // Or a different string if needed
            System.out.println("String to double: " + doubleValue);



        } catch (NumberFormatException e) {
            System.err.println("Invalid string format for conversion: " + e.getMessage());
        }


        // Illustrating what happens with an invalid string:
         String invalidStr = "abc";
        try {
             int invalidInt = Integer.parseInt(invalidStr); // This will throw an exception
        } catch (NumberFormatException e) {
             System.err.println("Cannot convert 'abc' to an integer: " + e.getMessage());
        }



    }
}

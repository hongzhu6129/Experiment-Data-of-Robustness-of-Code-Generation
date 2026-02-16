public class StringConversions {

    public static void main(String[] args) {
        String str = "12345";
        String strDecimal = "123.45";
        String strLong = "9876543210";


        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer value: " + intValue);

            long longValue = Long.parseLong(strLong);
            System.out.println("Long value: " + longValue);


            float floatValue = Float.parseFloat(strDecimal);
            System.out.println("Float value: " + floatValue);

            double doubleValue = Double.parseDouble(strDecimal);
            System.out.println("Double value: " + doubleValue);

            // Demonstrating another way to convert to integer using valueOf
            Integer intValue2 = Integer.valueOf(str);
            System.out.println("Integer value (using valueOf): " + intValue2);


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        // Handling potential errors (e.g., non-numeric strings) with specific checks
        String invalidStr = "abc";

        try {
            int invalidInt = Integer.parseInt(invalidStr);
            System.out.println("This won't print: " + invalidInt); // Won't reach here

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format: " + e.getMessage());
        }



    }
}

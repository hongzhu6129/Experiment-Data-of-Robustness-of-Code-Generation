public class StringConversions {

    public static void main(String[] args) {
        String str = "12345"; // Example string

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer value: " + intValue);

            long longValue = Long.parseLong(str);
            System.out.println("Long value: " + longValue);

            float floatValue = Float.parseFloat(str);
            System.out.println("Float value: " + floatValue);

            double doubleValue = Double.parseDouble(str);
            System.out.println("Double value: " + doubleValue);


        } catch (NumberFormatException e) {
            System.err.println("Invalid string format for number conversion: " + e.getMessage());
        }


        // Example with decimals
        String strDecimal = "12345.67";

        try {

            float floatValueDecimal = Float.parseFloat(strDecimal);
            System.out.println("Float value (decimal): " + floatValueDecimal);

            double doubleValueDecimal = Double.parseDouble(strDecimal);
            System.out.println("Double value (decimal): " + doubleValueDecimal);

        } catch (NumberFormatException e) {
            System.err.println("Invalid string format for number conversion: " + e.getMessage());
        }


    }
}

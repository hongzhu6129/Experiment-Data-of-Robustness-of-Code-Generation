public class StringConversions {

    public static void main(String[] args) {
        String str = "12345"; // Example string

        try {
            // Convert to int (+6 is unclear, assuming you mean adding 6 to the integer value)
            int intValue = Integer.parseInt(str);
            int intValuePlus6 = intValue + 6;
            System.out.println("Integer value + 6: " + intValuePlus6);

            // Convert to long
            long longValue = Long.parseLong(str);
            System.out.println("Long value: " + longValue);

            // Convert to float
            float floatValue = Float.parseFloat(str);
            System.out.println("Float value: " + floatValue);

            // Convert to double
            double doubleValue = Double.parseDouble(str);
            System.out.println("Double value: " + doubleValue);


        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid string format for conversion.  String provided: " + str);
        }
    }
}

public class StringToNumeric {

    public static void main(String[] args) {
        String str = "12345";
        String strDouble = "12345.6789";
        String strLong = "9876543210";


        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer value: " + intValue);

            long longValue = Long.parseLong(strLong);
            System.out.println("Long value: " + longValue);

            float floatValue = Float.parseFloat(strDouble);
            System.out.println("Float value: " + floatValue);

            double doubleValue = Double.parseDouble(strDouble);
            System.out.println("Double value: " + doubleValue);


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        // Demonstrating potential NumberFormatException
        String invalidStr = "abc";
        try {
            int invalidInt = Integer.parseInt(invalidStr);
        }catch (NumberFormatException e){
            System.out.println("Invalid string for conversion to int: " + e.getMessage());
        }

        // Demonstrating potential issues with large numbers
        String veryLargeNumber = "12345678901234567890"; // Too large for int and long


        try {
             int veryLargeInt = Integer.parseInt(veryLargeNumber);
        }catch (NumberFormatException e){
            System.out.println("Very large number for int conversion: " + e.getMessage());
        }


        try {
             long veryLargeLong = Long.parseLong(veryLargeNumber);

        }catch (NumberFormatException e){
            System.out.println("Very large number for long conversion: " + e.getMessage());
        }


    }
}

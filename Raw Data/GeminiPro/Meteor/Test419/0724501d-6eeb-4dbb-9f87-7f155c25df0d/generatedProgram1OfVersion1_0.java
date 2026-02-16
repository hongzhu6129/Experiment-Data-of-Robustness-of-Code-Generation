public class StringConversions {

    public static void main(String[] args) {

        String str = "12345";
        String strDouble = "123.45";
        String strLong = "9876543210";


        try {
            // String to int
            int intValue = Integer.parseInt(str);
            System.out.println("Int Value: " + intValue);

            // String to long
            long longValue = Long.parseLong(strLong);
            System.out.println("Long Value: " + longValue);

            // String to float
            float floatValue = Float.parseFloat(strDouble);
            System.out.println("Float Value: " + floatValue);

            // String to double
            double doubleValue = Double.parseDouble(strDouble);
            System.out.println("Double Value: " + doubleValue);


        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion: " + e.getMessage());
        }


         //Demonstrate a case with an invalid string (for error handling illustration)
        String invalidStr = "abc";
        try {
            int invalidInt = Integer.parseInt(invalidStr); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion (example 2): " + e.getMessage());
        }

    }
}

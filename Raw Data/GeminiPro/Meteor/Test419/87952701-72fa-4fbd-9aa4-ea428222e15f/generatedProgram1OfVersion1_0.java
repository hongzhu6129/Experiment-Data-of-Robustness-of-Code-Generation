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


            // Demonstrating handling potential NumberFormatExceptions
            String invalidStr = "abc";
            try {
                int invalidInt = Integer.parseInt(invalidStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer string: " + e.getMessage());
            }



        } catch (NumberFormatException e) {
            System.out.println("Number format exception caught: " + e.getMessage());
        }

    }
}

public class StringConversions {

    public static void main(String[] args) {
        String str = "12345";
        String strDecimal = "12345.6789";
        String strLong = "9876543210";


        try {
            // String to int
            int intValue = Integer.parseInt(str);
            System.out.println("String to int: " + intValue);

            // String to long
            long longValue = Long.parseLong(strLong);
            System.out.println("String to long: " + longValue);


            // String to float
            float floatValue = Float.parseFloat(strDecimal);
            System.out.println("String to float: " + floatValue);

            // String to double
            double doubleValue = Double.parseDouble(strDecimal);
            System.out.println("String to double: " + doubleValue);



        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        //Demonstrating potential NumberFormatException
        String invalidNumber = "abc";
         try {
             int invalidInt = Integer.parseInt(invalidNumber); 
         } catch (NumberFormatException ex) {
             System.out.println("NumberFormatException caught: " + ex.getMessage()); // This will be printed.
         }
    }
}

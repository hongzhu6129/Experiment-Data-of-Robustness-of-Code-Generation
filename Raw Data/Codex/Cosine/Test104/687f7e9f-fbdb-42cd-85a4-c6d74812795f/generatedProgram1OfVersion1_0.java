public class StringConversions {

    public static void main(String[] args) {
        String str = "12345"; // Example string

        try {
            // Convert to int (+6 is unclear, assuming you mean adding 6 to the integer value)
            int intValue = Integer.parseInt(str);
            int plusSix = intValue + 6;
            System.out.println("Integer + 6: " + plusSix);

            // Convert to long
            long longValue = Long.parseLong(str);
            System.out.println("Long: " + longValue);

            // Convert to float
            float floatValue = Float.parseFloat(str);
            System.out.println("Float: " + floatValue);

            // Convert to double
            double doubleValue = Double.parseDouble(str);
            System.out.println("Double: " + doubleValue);


        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for number conversion.");
        }


         // Demonstrating with a decimal string
         String decimalStr = "3.14159";

         try {
            double doubleValue2 = Double.parseDouble(decimalStr);
             System.out.println("Double from decimal string: " + doubleValue2);


             float floatValue2 = Float.parseFloat(decimalStr);
              System.out.println("Float from decimal string: " + floatValue2);


         } catch (NumberFormatException ex) {
             System.out.println("Invalid decimal string format.");
         }


    }
}

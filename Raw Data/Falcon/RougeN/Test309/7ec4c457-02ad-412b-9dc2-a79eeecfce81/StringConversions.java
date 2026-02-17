public class StringConversions {

    public static void main(String[] args) {
        String numStr = "12345";
        String floatStr = "3.14159";
        String doubleStr = "2.718281828459045";

        try {
            // Convert to int
            int numInt = Integer.parseInt(numStr);
            System.out.println("Integer: " + numInt);

            // Convert to long
            long numLong = Long.parseLong(numStr);
            System.out.println("Long: " + numLong);


            // Convert to float
            float numFloat = Float.parseFloat(floatStr);
            System.out.println("Float: " + numFloat);

            // Convert to double
            double numDouble = Double.parseDouble(doubleStr);
            System.out.println("Double: " + numDouble);

        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }


          // Demonstrating another potential string (handling errors gracefully)
        String invalidNumStr = "123a45"; // Contains a non-numeric character

          try {
            int invalidInt = Integer.parseInt(invalidNumStr);
            System.out.println("Invalid Integer: " + invalidInt); // This line won't be reached due to the exception
          } catch (NumberFormatException e) {
             System.err.println("Invalid number format for '123a45': " + e.getMessage());
          }
    }
}

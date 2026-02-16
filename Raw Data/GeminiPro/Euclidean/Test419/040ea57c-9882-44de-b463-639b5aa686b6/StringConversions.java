public class StringConversions {

    public static void main(String[] args) {

        String numStr = "12345";
        String decimalStr = "123.45";
        String longStr = "9876543210";


        try {
            int numInt = Integer.parseInt(numStr);
            System.out.println("Integer: " + numInt);

            long numLong = Long.parseLong(longStr);
            System.out.println("Long: " + numLong);


            float numFloat = Float.parseFloat(decimalStr);
            System.out.println("Float: " + numFloat);

            double numDouble = Double.parseDouble(decimalStr);
            System.out.println("Double: " + numDouble);


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }



        // Demonstrating handling very large numbers that might exceed long's capacity:
        String veryLargeNumber = "12345678901234567890"; 

        try {
            long veryLargeLong = Long.parseLong(veryLargeNumber);
            System.out.println("Very Large Long (if it fits): " + veryLargeLong); // This might throw an exception
        } catch (NumberFormatException e) {
            System.out.println("The number is too large for long: Using BigInteger instead.");

            java.math.BigInteger bigInteger = new java.math.BigInteger(veryLargeNumber);
            System.out.println("BigInteger: " + bigInteger);

        }



    }
}

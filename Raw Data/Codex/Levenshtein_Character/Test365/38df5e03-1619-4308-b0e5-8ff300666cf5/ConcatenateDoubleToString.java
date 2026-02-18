public class ConcatenateDoubleToString {

    public static void main(String[] args) {

        String str1 = "The value of pi is ";
        double doubleValue = 3.14159;

        // Method 1: Using String.valueOf()
        String result1 = str1 + String.valueOf(doubleValue);
        System.out.println("Method 1: " + result1);

        // Method 2: Using Double.toString()
        String result2 = str1 + Double.toString(doubleValue);
        System.out.println("Method 2: " + result2);


        // Method 3: Using String concatenation (implicit conversion)
        String result3 = str1 + doubleValue; // Java automatically converts double to String
        System.out.println("Method 3: " + result3);


        // Example with different double values:
        double anotherDouble = 12345.6789;

        String result4 = "Another number: " + anotherDouble;
        System.out.println(result4);

         //Formatting the double value (e.g., to two decimal places) during concatenation
        double price = 19.9999;
        String formattedPriceString = String.format("The price is: %.2f", price); // %.2f formats to 2 decimal places
        System.out.println(formattedPriceString);

    }
}

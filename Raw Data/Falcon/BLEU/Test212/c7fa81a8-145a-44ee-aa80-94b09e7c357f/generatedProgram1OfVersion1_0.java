public class ReverseInteger {

    public static void main(String[] args) {

        // Example integer to reverse
        int number = 12345;

        // Method 1: Using String manipulation
        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
        int reversedNumberString = Integer.parseInt(reversedString);
        System.out.println("Reversed using String manipulation: " + reversedNumberString);

        // Method 2: Using arithmetic operations
        int reversedNumberArithmetic = 0;
        int temp = number; 
        while (temp != 0) {
            int digit = temp % 10;
            reversedNumberArithmetic = reversedNumberArithmetic * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed using arithmetic operations: " + reversedNumberArithmetic);


        // Handling negative numbers (for both methods)
        int negativeNumber = -6789;

        // String method with negative handling:
        int reversedNegativeString = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(negativeNumber))).reverse().toString()) * (negativeNumber < 0 ? -1 : 1) ;  // Handles the sign correctly
        System.out.println("Reversed negative number using String manipulation: " + reversedNegativeString);


        // Arithmetic method with negative handling
        int reversedNegativeArithmetic = 0;
        temp = Math.abs(negativeNumber); // Work with absolute value
        while (temp != 0) {
             int digit = temp % 10;
            reversedNegativeArithmetic = reversedNegativeArithmetic * 10 + digit;
            temp /= 10;
        }
        reversedNegativeArithmetic = reversedNegativeArithmetic * (negativeNumber < 0 ? -1 : 1);  // Apply the original sign
        System.out.println("Reversed negative number using arithmetic: " + reversedNegativeArithmetic);



        // Handling overflow (a more robust arithmetic approach - important for interviews)
        long numOverflow = 1534236469; // Example that might overflow an int

        long reversedOverflow = 0;
        long tempOverflow = numOverflow;

        while(tempOverflow != 0) {
            long digit = tempOverflow % 10;
            if (reversedOverflow > Long.MAX_VALUE/10 || (reversedOverflow == Long.MAX_VALUE / 10 && digit > 7)) { 
                 System.out.println("Overflow detected!");
                 return; // Or throw an exception, depending on your requirements
            }
            if (reversedOverflow < Long.MIN_VALUE/10 || (reversedOverflow == Long.MIN_VALUE / 10 && digit < -8)) {
                System.out.println("Overflow detected!");
                 return;
            }
            reversedOverflow = reversedOverflow * 10 + digit;
            tempOverflow /= 10;
        }

        System.out.println("Reversed (overflow handled): " + reversedOverflow);



    }
}

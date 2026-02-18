public class ReverseInteger {

    public static void main(String[] args) {

        int number = 12345; // Example integer
        int reversedNumber = 0;

        // Method 1: Using while loop and modulo operator
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed number (Method 1): " + reversedNumber);


        // Method 2:  Using StringBuilder (String manipulation)
        reversedNumber = 0; // Reset for second method
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        try {
            reversedNumber = Integer.parseInt(sb.reverse().toString());
            System.out.println("Reversed number (Method 2): " + reversedNumber);

        } catch (NumberFormatException e) {
            System.out.println("Number too large to reverse using String method.");
        }



        // Handling negative numbers (for both methods - apply before the reversal logic)
        number = -6789;  // Example negative number

        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number; // Make it positive for reversing
        }

        reversedNumber = 0;  // Reset
        temp = number;
        while (temp != 0) { // Reversal logic (same as Method 1)
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }


        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("Reversed negative number (Method 1 adapted): " + reversedNumber);



    }
}

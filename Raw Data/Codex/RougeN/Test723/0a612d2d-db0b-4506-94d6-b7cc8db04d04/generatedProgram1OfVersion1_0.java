public class ReverseInteger {

    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversedNumber = 0;

        System.out.println("Original number: " + number);

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);



        // Handling integer overflow (more robust solution):

        number = 1534236469; // Example number that might cause overflow
        System.out.println("Original number (overflow example): " + number);
        reversedNumber = 0;
        boolean overflow = false;


        while (number != 0) {
            int digit = number % 10;
            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                overflow = true;
                break;  // Handle positive overflow
            } else if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                overflow = true;
                break;  // Handle negative overflow
            }

            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;

        }


        if (overflow) {
            System.out.println("Reversed number (overflow): 0 "); // Return 0 on overflow (as LeetCode does)
        } else {
            System.out.println("Reversed number (overflow example): " + reversedNumber);

        }



        // Handling negative numbers:

        number = -12345;
        System.out.println("Original number (negative): " + number);
        reversedNumber = 0;
        boolean isNegative = false;



        if(number < 0){
            isNegative = true;
            number = -number; // make number positive

        }


        while (number != 0) {
            int digit = number % 10;
             if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                overflow = true;
                break;  // Handle positive overflow
            }
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;

        }
        if (isNegative){
            reversedNumber = -reversedNumber;
        }


        if (overflow) {
            System.out.println("Reversed number (negative, potential overflow): 0 "); // Return 0 on overflow
        } else {
            System.out.println("Reversed number (negative): " + reversedNumber);
        }
    }
}

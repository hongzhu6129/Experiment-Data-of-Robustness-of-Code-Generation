public class ReverseInteger {

    public static void main(String[] args) {
        int number = 12345; // Example number, you can change this

        int reversedNumber = 0;
        int originalNumber = number; // Store the original number for printing


        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; 
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);


        // Handling integer overflow (optional, but good practice)
        // Demonstrates a different approach to reversing that can help identify overflow
        number = originalNumber;  // Reset number

        try {
             reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString()) * (number < 0 ? -1 : 1);
            System.out.println("Reversed Number (overflow check): " + reversedNumber); 
        } catch (NumberFormatException e) {
            System.out.println("Integer Overflow Occurred during reversal.");
        }


    }
}

public class ReverseInteger {

    public static void main(String[] args) {

        // Example usage:
        int num1 = 12345;
        int reversed1 = reverseInteger(num1);
        System.out.println("Original number: " + num1 + ", Reversed number: " + reversed1); // Output: 54321

        int num2 = -6789;
        int reversed2 = reverseInteger(num2);
        System.out.println("Original number: " + num2 + ", Reversed number: " + reversed2); // Output: -9876

        int num3 = 1534236469; // Example of integer overflow
        int reversed3 = reverseInteger(num3); 
        System.out.println("Original number: " + num3 + ", Reversed number: " + reversed3); // Output: 0 (or a different incorrect value depending on how Java handles overflow)


        // Additional Explanations within main for educational purposes:
        System.out.println("\nExplanation:");
        System.out.println("The reverseInteger method reverses an integer by repeatedly extracting the last digit and building the reversed number.");
        System.out.println("It handles negative numbers correctly by storing the sign and applying it to the final reversed number.");
        System.out.println("It also includes a check for integer overflow. If the reversed number exceeds the maximum or minimum integer value, it returns 0.");


    }

    public static int reverseInteger(int num) {
        long reversedNum = 0; // Use long to handle potential overflow temporarily
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num = -num; // Make num positive for easier calculations
        }

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;


            // Check for overflow during the process
            if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                return 0; 
            }

        }

        if (isNegative) {
            return (int)(-reversedNum); // Cast back to int after overflow check and negate
        } else {
            return (int)reversedNum; // Cast back to int after overflow check
        }
    }
}

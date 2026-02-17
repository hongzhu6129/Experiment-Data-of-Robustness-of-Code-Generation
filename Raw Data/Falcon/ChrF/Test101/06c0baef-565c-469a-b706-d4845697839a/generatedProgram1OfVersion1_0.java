public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;

        System.out.println("Original Number: " + num);


        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);


        // Handling negative numbers and overflow (within main method constraints)
        int num2 = -67890;
        boolean isNegative = false;
        if (num2 < 0) {
            isNegative = true;
            num2 = -num2; // Make it positive for the reversal logic
        }

        reversedNum = 0; // Reset for the second example

        while (num2 != 0) {
            int digit = num2 % 10;
            
            // Simple overflow check (not comprehensive due to main method limitations):
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println("Reversed Number for " + (isNegative ? -num2 : num2) + ": Overflow");
                return; // Exit main in case of overflow
            }
           
            reversedNum = reversedNum * 10 + digit;
            num2 /= 10;
        }

        if (isNegative) {
            reversedNum = -reversedNum;
        }
        System.out.println("Reversed Number for " + (isNegative ? -num2 * 10 : num2 * 10 ) + ": "+ reversedNum);



    }
}

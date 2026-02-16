class Solution {
    public static void main(String[] args) {
        // Input integer (you can change this value)
        int num = 12345;

        // Reverse the integer
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Print the reversed integer
        System.out.println("Reversed Number: " + reversedNum);


        // Example with a negative number:
        int negativeNum = -6789;
        int reversedNegativeNum = 0;

         // Handle the negative sign (optional, you could also remove it and add it later)
         boolean isNegative = (negativeNum < 0);
        if (isNegative) {
             negativeNum = -negativeNum; // Make it positive for the reversal
        }


        while (negativeNum != 0) {
            int digit = negativeNum % 10;
            reversedNegativeNum = reversedNegativeNum * 10 + digit;
            negativeNum /= 10;
        }

        if (isNegative) {
           reversedNegativeNum = -reversedNegativeNum;
        }


        System.out.println("Reversed Negative Number: " + reversedNegativeNum);


         // Example of handling potential overflow (important!)
        int largeNum = Integer.MAX_VALUE; // Or any very large integer
        long reversedLargeNum = 0; // Use long to accommodate potentially larger values

        while (largeNum != 0) {
            int digit = largeNum % 10;
            reversedLargeNum = reversedLargeNum * 10 + digit;
            largeNum /= 10;


            // Check for overflow after multiplication/addition
            if (reversedLargeNum > Integer.MAX_VALUE || reversedLargeNum < Integer.MIN_VALUE) {
                System.out.println("Overflow occurred!");
                return; // or handle the overflow appropriately
            }
        }
        System.out.println("Reversed Large Number: " + reversedLargeNum);






    }
}

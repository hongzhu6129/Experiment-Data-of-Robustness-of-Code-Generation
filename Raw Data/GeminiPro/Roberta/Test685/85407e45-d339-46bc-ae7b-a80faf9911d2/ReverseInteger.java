public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345; // Example integer
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);


        //Handling overflow (demonstration - more robust checks could be implemented)
        num = Integer.MAX_VALUE; // Example integer near maximum limit
        reversedNum = 0;
        boolean overflow = false;

        while (num != 0) {
            int digit = num % 10;
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                overflow = true;
                break; // Stop if overflow occurs
            }
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (overflow) {
            System.out.println("Overflow occurred during reversal.");
        } else {
            System.out.println("Reversed Number (with overflow handling): " + reversedNum);
        }

         // Similar handling for the negative minimum bound
        num = Integer.MIN_VALUE;
        reversedNum = 0;
        overflow = false;

        while (num != 0) {
            int digit = num % 10;
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                overflow = true;
                break;
            }
            reversedNum = reversedNum * 10 + digit;
            num /= 10;

        }

        if(overflow){
            System.out.println("Overflow occurred during reversal.");
        } else {
            System.out.println("Reversed Number (with overflow handling, negative case): " + reversedNum);
        }
    }
}


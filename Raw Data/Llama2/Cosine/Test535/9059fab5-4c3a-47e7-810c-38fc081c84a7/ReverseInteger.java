public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Original Number: " + num);

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);


        //Handling overflow/underflow (though the problem description didn't specify)
        num = Integer.MAX_VALUE; // Or Integer.MIN_VALUE to test underflow
        System.out.println("\nOriginal Number (testing overflow/underflow): " + num);

         reversed = 0;
        boolean overflow = false;

        while (num != 0) {
            int digit = num % 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {  //Overflow check for positive
                overflow = true;
                break;
            } else if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) { //Underflow check for negative
                 overflow = true;
                break;

            }

            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (overflow) {
            System.out.println("Reversed Number: Overflow/Underflow occurred");
        } else {
             System.out.println("Reversed Number: " + reversed);
        }


    }
}

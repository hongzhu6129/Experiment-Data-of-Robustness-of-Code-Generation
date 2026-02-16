public class ReverseInteger {

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        // Handle negative numbers
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }


        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }


        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("Reversed Number: " + reversedNumber);


        // Example with Integer.MIN_VALUE (demonstrates overflow handling, albeit basic)
        number = Integer.MIN_VALUE;
        reversedNumber = 0; 
        isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number; // This will overflow with Integer.MIN_VALUE!

        }

         try {
            while(number > 0) {
                reversedNumber = Math.multiplyExact(reversedNumber, 10); // Check for overflow
                reversedNumber = Math.addExact(reversedNumber, number % 10); // Check for overflow
                number = number / 10;
            }
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred during reversal of Integer.MIN_VALUE!");
            return; // Or handle it as needed
        }

        if (isNegative) {

           try {
               reversedNumber = Math.negateExact(reversedNumber); //Check for overflow on negation
           } catch(ArithmeticException e) {
               System.out.println("Overflow occurred during reversal of Integer.MIN_VALUE!");
               return;
           }

        }

        System.out.println("Reversed Integer.MIN_VALUE (with overflow handling): " + reversedNumber);



        //  Another example showing handling of zero
         number = 0;
         reversedNumber = 0;

         System.out.println("Reversed 0 : " + reversedNumber); //Output is 0


    }
}

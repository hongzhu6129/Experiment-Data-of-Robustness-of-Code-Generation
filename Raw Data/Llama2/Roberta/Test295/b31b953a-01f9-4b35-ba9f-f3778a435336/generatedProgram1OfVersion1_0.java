public class RoundUpIntegerDivision {

    public static void main(String[] args) {

        // Demonstrate rounding up integer division using Math.ceil()

        int numerator = 7;
        int denominator = 3;

        // Incorrect - integer division truncates (discards) the fractional part
        int resultTruncated = numerator / denominator; 
        System.out.println("Truncated result: " + resultTruncated); // Output: 2


        // Correct - Cast at least one operand to double before division, then use Math.ceil()
        double resultRoundedUp = Math.ceil((double) numerator / denominator);
        System.out.println("Rounded up result (using Math.ceil): " + resultRoundedUp); // Output: 3.0

        // Another way - using the modulo operator (%)
        int resultRoundedUp2 = (numerator + denominator - 1) / denominator;
        System.out.println("Rounded up result (using modulo): " + resultRoundedUp2); // Output: 3



        // More Examples
        System.out.println(Math.ceil((double) 10 / 4)); // 2.5 -> 3.0
        System.out.println(Math.ceil((double) 5 / 2));  // 2.5 -> 3.0
        System.out.println(Math.ceil((double) 11 / 3)); // 3.666... -> 4.0
        System.out.println(Math.ceil((double) 1 / 5)); // 0.2 -> 1.0 (important edge case)

        System.out.println((10 + 4 -1)/4); // 3
         System.out.println((5+2-1)/2); // 3
         System.out.println((11+3-1)/3); // 4
         System.out.println((1+5-1)/5); //1


        //Important note on negative numbers:
        System.out.println(Math.ceil((double)-7/3)); // -2.333 -> -2.0 (Rounds towards positive infinity)
        // If you need to round towards zero (like integer division normally does with negative numbers), 
        // you'll have to handle negative numbers as a special case.  e.g.,
        numerator = -7;
        denominator = 3;
        if (numerator < 0) {
             resultRoundedUp = Math.floor((double)numerator / denominator); //-2.333 -> -3.0
         } else{
             resultRoundedUp = Math.ceil((double) numerator / denominator); 
         }
        System.out.println("Rounded up result (handling negative numbers): "+ resultRoundedUp);


    }
}

public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 17;
        int denominator = 5;

        // Using Math.ceil to round up the result of the division
        int roundedUpResult = (int) Math.ceil((double) numerator / denominator); 

        System.out.println("Numerator: " + numerator);
        System.out.println("Denominator: " + denominator);
        System.out.println("Rounded up result: " + roundedUpResult);



        //Demonstrating with other examples
        demonstrateRounding(7, 3);   // Output: 3
        demonstrateRounding(10, 2);  // Output: 5
        demonstrateRounding(5, 6);   // Output: 1 (because 5/6 is less than 1, it rounds up to 1)
        demonstrateRounding(-7, 3);  // Output: -2 (rounds towards positive infinity)
        demonstrateRounding(7,-3);  // Output: -2 (rounds towards positive infinity)



    }

    //Helper function to avoid repeating code in main for demonstration purposes.
    public static void demonstrateRounding(int num, int den) {
         int result = (int) Math.ceil((double) num / den);
         System.out.println(num + " / " + den + " rounded up = " + result);
    }
}

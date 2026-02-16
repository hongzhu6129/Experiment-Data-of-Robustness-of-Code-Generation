public class FormulaCalculation {

    public static void main(String[] args) {
        // Calculate the formula: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        double result = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0));

        System.out.println("Result of the formula: " + result);


        //  Explanation of the code and formula:
        // **************************************

        /*
        1. Order of Operations (PEMDAS/BODMAS):  Parentheses/Brackets, Exponents/Orders, Multiplication and Division (from left to right), Addition and Subtraction (from left to right).

        2. Floating-Point Numbers: We use 1.0, 3.0, etc. to ensure floating-point division. If we used 1/3, it would be integer division, resulting in 0.

        3. Breakdown:
           - (1.0/3.0), (1.0/5.0), etc.:  These are the individual divisions within the inner parentheses.
           - 1.0 - (1.0/3.0) + (1.0/5.0) - ... : The subtractions and additions are performed from left to right.
           - 4.0 * (...): Finally, we multiply the result of the inner expression by 4.0.

        4. Printing the result: System.out.println() displays the calculated value to the console.
         */


    }
}

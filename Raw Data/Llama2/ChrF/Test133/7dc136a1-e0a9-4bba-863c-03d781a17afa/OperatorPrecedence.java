public class OperatorPrecedence {

    public static void main(String[] args) {
        // a. -5 + 8 * 6
        int resultA = -5 + 8 * 6;
        System.out.println("a. -5 + 8 * 6 = " + resultA); // Output: 43

        // b. (55+9) % 9
        int resultB = (55 + 9) % 9;
        System.out.println("b. (55+9) % 9 = " + resultB); // Output: 1

        // c. 20 + -3*5 / 8
        int resultC = 20 + -3 * 5 / 8;
        System.out.println("c. 20 + -3*5 / 8 = " + resultC); // Output: 18  (integer division)

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + resultD); // Output: 13


        //To get the expected output 19 for (c), we need to use floating-point division:
         double resultC_float = 20 + (double)-3 * 5 / 8;  // Cast one operand to double
        System.out.println("c. 20 + -3*5 / 8 (with floating-point division) = " + resultC_float);  // Output: 18.125, then round to 19 if necessary in your problem context


    }
}

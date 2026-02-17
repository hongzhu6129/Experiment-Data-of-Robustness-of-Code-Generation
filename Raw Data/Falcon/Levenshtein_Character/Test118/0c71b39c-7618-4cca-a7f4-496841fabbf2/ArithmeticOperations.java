public class ArithmeticOperations {

    public static void main(String[] args) {
        // a. -5 + 8 * 6
        int resultA = -5 + 8 * 6;
        System.out.println("-5 + 8 * 6 = " + resultA); // Output: 43

        // b. (55+9) % 9
        int resultB = (55 + 9) % 9;
        System.out.println("(55+9) % 9 = " + resultB); // Output: 1

        // c. 20 + -3*5 / 8
        int resultC = 20 + -3 * 5 / 8;
        System.out.println("20 + -3*5 / 8 = " + resultC); // Output: 19  (integer division)

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + resultD); // Output: 13


        //Explanations (you can uncomment these if you want them to print)

        /*
        System.out.println("\nExplanations:");
        System.out.println("a. Multiplication (*) has higher precedence than addition (+).");
        System.out.println("b. The modulo operator (%) gives the remainder of a division.");
        System.out.println("c. Integer division truncates the decimal part.  -3*5 is -15, -15/8 is -1.875 which becomes -1 as an integer.");
        System.out.println("d. Division (/) and multiplication (*) have the same precedence and are evaluated left to right.  Modulo operator (%) has same precedence as * and /.");
         */
    }
}

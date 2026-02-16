public class ArithmeticOperations {

    public static void main(String[] args) {
        // a. -5 + 8 * 6
        int resultA = -5 + 8 * 6;
        System.out.println(resultA); // Output: 43

        // b. (55+9) % 9
        int resultB = (55 + 9) % 9;
        System.out.println(resultB); // Output: 1

        // c. 20 + -3*5 / 8  (Assuming 'h' was a typo and meant '+')
        int resultC = 20 + -3 * 5 / 8; 
        System.out.println(resultC); // Output: 18 (integer division)

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(resultD); // Output: 13
    }
}

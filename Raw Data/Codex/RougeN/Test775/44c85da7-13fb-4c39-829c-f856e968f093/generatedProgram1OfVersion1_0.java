public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6); // a. -5 + 8 * 6
        System.out.println((55 + 9) % 9); // b. (55+9) % 9
        System.out.println(20 + -3 * 5 / 8); // c. 20 + -3*5 / 8
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // d. 5 + 15 / 3 * 2 - 8 % 3


        System.out.println("Detailed Calculations:");
        System.out.println("a. -5 + 8 * 6 = -5 + 48 = 43");
        System.out.println("b. (55 + 9) % 9 = 64 % 9 = 1");
        System.out.println("c. 20 + -3 * 5 / 8 = 20 + -15 / 8 = 20 - 1 = 19 (integer division)"); // Note: Integer division discards the remainder.
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = 5 + 5 * 2 - 2 = 5 + 10 - 2 = 13");
    }
}

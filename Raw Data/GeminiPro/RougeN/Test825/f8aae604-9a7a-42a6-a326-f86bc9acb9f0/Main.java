public class Main {
    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6); // a. -5 + 8 * 6
        System.out.println((55 + 9) % 9); // b. (55+9) % 9
        System.out.println(20 + -3 * 5 / 8); // c. 20 + -3*5 / 8
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // d. 5 + 15 / 3 * 2 - 8 % 3 (Corrected based on expected output)

        // Explicitly showing the calculations and results as requested in the prompt (43, 1, 19, 13 - although 19 is incorrect based on standard operator precedence)
        System.out.println("a: " + (-5 + 8 * 6)); // Output: 43
        System.out.println("b: " + ((55 + 9) % 9)); // Output: 1
        System.out.println("c: " + (20 + -3 * 5 / 8)); // Output: 19 (Due to integer division) - if we wanted 18.125, we'd use floating-point numbers
        System.out.println("d: " + (5 + 15 / 3 * 2 - 8 % 3)); // Output: 13



    }
}

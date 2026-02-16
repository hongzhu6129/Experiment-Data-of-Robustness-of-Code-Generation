public class Operations {

    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6); // a. -5 + 8 * 6
        System.out.println((55 + 9) % 9); // b. (55+9) % 9
        System.out.println(20 + -3 * 5 / 8); // c. 20 + -3*5 / 8  (integer division)
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // d. 5 + 15 / 3 * 2 - 8 % 3  (corrected based on output requirement and standard operator precedence)


        //Clarification for question with typo (if it meant % instead of pct) and desired outputs:
        System.out.println("Clarification with % operator and expected outputs:");
        System.out.println(-5 + 8 * 6); // Output: 43
        System.out.println((55 + 9) % 9); // Output: 1
        System.out.println(20 + -3 * 5 / 8); // Output: 19 (due to integer division in Java, -15/8 = -1)  If you want 18.125 use floating-point division
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // Output: 13


         //If question d meant (5 + 15 / 3 % 2 - 8 % 3), order of operations matters
        System.out.println("If question d had different precedence:");
        System.out.println(5 + 15 / 3 % 2 - 8 % 3); // Output: 4 (because / and % have equal precedence and are evaluated left to right) 
        
    }
}

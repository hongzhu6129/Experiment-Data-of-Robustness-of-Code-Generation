public class ComputeExpressions {

    public static void main(String[] args) {
        double result1 = 7.5 % 6.5 - 4.5 * 3 / 47.5 - 5.5;
        System.out.println(result1);


        // To clarify the order of operations, we can add parentheses (though not strictly necessary in this case due to operator precedence):
        double result2 = (7.5 % 6.5) - ((4.5 * 3) / 47.5) - 5.5;
        System.out.println(result2); // Output will be the same as above


        // For the second expression (7.5 - 5.5):
        double result3 = 7.5 - 5.5;
        System.out.println(result3);
    }
}

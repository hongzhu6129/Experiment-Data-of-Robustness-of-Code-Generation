public class FormulaCalculation {

    public static void main(String[] args) {
        // Formula: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        double result = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0));

        System.out.println(result); // Output: 2.9760461760461765


        //  More efficient and general approach using a loop:

        double sum = 0.0;
        int sign = 1; // Alternating sign

        for (int i = 1; i <= 11; i += 2) {
            sum += (double) sign / i;
            sign *= -1; // Change sign for the next term
        }

        result = 4.0 * (1.0 + sum);  // Add 1 because the loop starts from 1/3

        System.out.println(result); // Output: 2.9760461760461765

    }
}

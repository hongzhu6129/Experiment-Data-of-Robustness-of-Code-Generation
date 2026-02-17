public class SumSeries {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of the series 1 to 10 is: " + sum);

        // Alternatively, you can calculate the sum using the mathematical formula:
        int sumFormula = (10 * (10 + 1)) / 2;
        System.out.println("Using the formula, the sum is: " + sumFormula);
    }
}

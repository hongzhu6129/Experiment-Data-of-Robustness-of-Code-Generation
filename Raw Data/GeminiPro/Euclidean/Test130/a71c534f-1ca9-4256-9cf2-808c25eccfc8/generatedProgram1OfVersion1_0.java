public class Summation {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to 10 is: " + sum);


        // Alternative (formula-based) approach for demonstration:
        int n = 10;
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Using the formula, the sum is: " + sumFormula);
    }
}

public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(4);
        double piApproximation2 = calculatePi(5);

        System.out.println("Approximation with 4 terms: " + piApproximation1);
        System.out.println("Approximation with 5 terms: " + piApproximation2);

    }

    public static double calculatePi(int numTerms) {
        double sum = 1.0;
        int denominator = 3;
        int sign = -1;

        for (int i = 2; i <= numTerms; i++) {
            sum += (sign * (1.0 / denominator));

            sign *= -1; 
            denominator += (i % 2 == 0) ? 4 : 2; // Add 4 if term number is even, add 2 if odd
        }

        return 4.0 * sum;
    }
}

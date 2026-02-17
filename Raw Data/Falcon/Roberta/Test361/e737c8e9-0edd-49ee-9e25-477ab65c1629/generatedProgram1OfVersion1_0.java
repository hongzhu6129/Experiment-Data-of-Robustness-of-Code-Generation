public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(5); // Calculate with 5 terms
        double piApproximation2 = calculatePi(6); // Calculate with 6 terms

        System.out.println("Approximation with 5 terms: " + piApproximation1);
        System.out.println("Approximation with 6 terms: " + piApproximation2);
    }

    public static double calculatePi(int numTerms) {
        double sum = 0.0;
        for (int i = 1; i <= numTerms; i++) {
            double term = 1.0 / (2 * i - 1); // Calculate the i-th term
            if (i % 2 == 0) {
                sum -= term; // Subtract even terms
            } else {
                sum += term; // Add odd terms
            }
        }
        return 4 * sum;
    }
}

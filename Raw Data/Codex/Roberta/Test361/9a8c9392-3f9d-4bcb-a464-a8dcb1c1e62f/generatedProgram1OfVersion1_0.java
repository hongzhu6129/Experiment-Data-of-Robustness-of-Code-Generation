public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(5); // Up to 1/11
        double piApproximation2 = calculatePi(6); // Up to 1/13

        System.out.println("Approximation 1 (up to 1/11): " + piApproximation1);
        System.out.println("Approximation 2 (up to 1/13): " + piApproximation2);

    }

    public static double calculatePi(int numTerms) {
        double sum = 0.0;
        for (int i = 1; i <= numTerms; i++) {
            double term = 1.0 / (2 * i - 1);
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        return 4 * sum;

    }
}

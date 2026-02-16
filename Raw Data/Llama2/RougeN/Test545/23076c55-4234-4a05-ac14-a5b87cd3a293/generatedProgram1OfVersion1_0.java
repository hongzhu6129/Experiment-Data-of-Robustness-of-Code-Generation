public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(5); // Calculate with 5 terms
        double piApproximation2 = calculatePi(6); // Calculate with 6 terms

        System.out.println("Approximation with 5 terms: " + piApproximation1);
        System.out.println("Approximation with 6 terms: " + piApproximation2);
    }

    public static double calculatePi(int numTerms) {
        double sum = 0.0;
        for (int i = 0; i < numTerms; i++) {
            double denominator = 2 * i + 1.0; // Calculate the denominator (1, 3, 5, 7...)
            double term = 1.0 / denominator;

            // Alternate adding and subtracting terms based on even/odd i
            if (i % 2 == 0) {  //If i is even
                sum += term;
            } else {           // If i is odd
                sum -= term;
            }
        }
        return 4.0 * sum;
    }
}

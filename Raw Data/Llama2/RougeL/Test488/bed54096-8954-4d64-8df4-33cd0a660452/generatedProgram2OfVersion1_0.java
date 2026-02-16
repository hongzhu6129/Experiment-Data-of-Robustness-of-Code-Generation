public class ApproximatePiLoop {

    public static void main(String[] args) {
        int numTerms = 1000000; // Example: calculate with a million terms
        double piApproximation = 0.0;

        for (int i = 1; i <= numTerms; i++) {
            double term = 1.0 / (2.0 * i - 1.0);
            if (i % 2 == 1) {
                piApproximation += term;
            } else {
                piApproximation -= term;
            }
        }

        piApproximation *= 4.0;
        System.out.println("Pi approximation (" + numTerms + " terms): " + piApproximation);
    }
}

public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(5); // Up to 1/11
        double piApproximation2 = calculatePi(6); // Up to 1/13

        System.out.println("Approximation 1 (up to 1/11): " + piApproximation1);
        System.out.println("Approximation 2 (up to 1/13): " + piApproximation2);
    }

    public static double calculatePi(int numTerms) {
        double sum = 1.0;
        double sign = -1.0; 

        for (int i = 1; i < numTerms; i++) {
            double denominator = 2 * i + 1;
             // For terms 1/9, 1/17 etc. the sign remains positive
            if (denominator % 4 == 1 && denominator!=1) { // Check if denominator is a multiple of 4 + 1 and not 1
               sign = 1.0;
            } else if (denominator!=1){  // other than first term &  multiples of 4 + 1, alternate signs
               sign = -1.0;
            }


            sum += sign / denominator;
        }

        return 4 * sum;
    }
}

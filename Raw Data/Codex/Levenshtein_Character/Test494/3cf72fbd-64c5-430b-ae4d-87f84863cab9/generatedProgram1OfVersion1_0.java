public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = calculatePi(5); // Up to 1/11
        double piApproximation2 = calculatePi(6); // Up to 1/13

        System.out.println("Approximation 1 (up to 1/11): " + piApproximation1);
        System.out.println("Approximation 2 (up to 1/13): " + piApproximation2);
    }

    public static double calculatePi(int numTerms) {
        double sum = 1.0; // Initialize sum to 1.0 (not 1)
        int denominator = 3;
        int sign = -1;

        for (int i = 2; i <= numTerms; i++) {
            
            if (i % 2 == 0) { // Handle the + 1/9 case
                sum += (1.0 / denominator) * sign;
            } else {
                sum += (1.0 / denominator) * sign;
            }


            denominator += 2; // Increment denominator by 2 each time
            if (i%2 == 0 )
            {
                denominator += 2;
            }

            sign *= -1; // Alternate the sign
        }

        return 4.0 * sum;
    }
}

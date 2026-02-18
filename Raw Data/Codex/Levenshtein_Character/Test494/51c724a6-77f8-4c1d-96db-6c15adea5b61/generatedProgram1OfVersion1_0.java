public class ApproximatePi {

    public static void main(String[] args) {
        // Calculate the approximation of pi with 5 terms
        double piApproximation1 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) );

        // Calculate the approximation of pi with 6 terms
        double piApproximation2 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0/13.0));


        System.out.println("Approximation with 5 terms (up to 1/11): " + piApproximation1);
        System.out.println("Approximation with 6 terms (up to 1/13): " + piApproximation2);
    }
}

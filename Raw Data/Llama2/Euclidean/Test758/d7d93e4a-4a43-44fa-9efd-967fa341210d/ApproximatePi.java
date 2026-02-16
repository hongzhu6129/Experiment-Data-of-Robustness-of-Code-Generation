public class ApproximatePi {

    public static void main(String[] args) {
        // Calculate the approximation of pi using the given formula with 5 terms
        double piApproximation1 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0));

        // Calculate the approximation of pi using the given formula with 6 terms
        double piApproximation2 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0));


        System.out.println("Approximation of pi (5 terms): " + piApproximation1);
        System.out.println("Approximation of pi (6 terms): " + piApproximation2);


    }
}

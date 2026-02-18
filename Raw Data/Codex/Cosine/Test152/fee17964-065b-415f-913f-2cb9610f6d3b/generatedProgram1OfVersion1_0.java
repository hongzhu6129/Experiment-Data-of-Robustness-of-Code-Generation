public class ApproximatePi {

    public static void main(String[] args) {
        // Calculate pi with 5 terms
        double piApproximation5 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0));

        // Calculate pi with 6 terms
        double piApproximation6 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0/13.0));


        System.out.println("Approximation with 5 terms (1/11): " + piApproximation5);
        System.out.println("Approximation with 6 terms (1/13): " + piApproximation6); 
    }
}

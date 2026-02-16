public class ApproximatePi {

    public static void main(String[] args) {
        // Calculate pi approximation with 5 terms
        double piApproximation1 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0)); 
        System.out.println("Pi approximation (5 terms): " + piApproximation1);

        // Calculate pi approximation with 6 terms
        double piApproximation2 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0));
        System.out.println("Pi approximation (6 terms): " + piApproximation2);
    }
}

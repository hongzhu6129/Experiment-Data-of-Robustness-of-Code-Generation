public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = -5;
        int denominator = 2;

        double result = Math.ceil((double) numerator / denominator); // Cast to double for accurate division

        System.out.println("Rounded up result (away from zero): " + (int) result); // Cast back to int
    }
}

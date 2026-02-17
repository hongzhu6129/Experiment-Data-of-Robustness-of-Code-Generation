public class ApproximatePi {

    public static void main(String[] args) {
        double approximation1 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0));
        double approximation2 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0));

        System.out.println("Approximation 1: " + approximation1);
        System.out.println("Approximation 2: " + approximation2);
    }
}

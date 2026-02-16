public class ApproximatePi {

    public static void main(String[] args) {
        // Calculate pi with 5 terms
        double pi5 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0)); 
        System.out.println("Pi approximation with 6 terms: " + pi5);

        // Calculate pi with 7 terms
        double pi7 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0));
        System.out.println("Pi approximation with 7 terms: " + pi7);


    }
}

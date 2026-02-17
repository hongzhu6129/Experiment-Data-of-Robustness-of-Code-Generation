public class ApproximatePi {

    public static void main(String[] args) {
        double approximation1 = calculatePi(5); // Up to 1/11
        double approximation2 = calculatePi(6); // Up to 1/13

        System.out.println("Approximation 1 (up to 1/11): " + approximation1);
        System.out.println("Approximation 2 (up to 1/13): " + approximation2);
    }

    public static double calculatePi(int numTerms) {
        double sum = 1.0;
        double sign = -1.0;

        for (int i = 2; i <= numTerms; i++) {
            double denominator = 2 * i - 1;
             if (i%2 == 0){
                sum += sign / denominator;  //adding the even terms as +ve, odd as -ve
            } else{
                sum -= sign/denominator;
            }
        }


        return 4.0 * sum;
    }
}

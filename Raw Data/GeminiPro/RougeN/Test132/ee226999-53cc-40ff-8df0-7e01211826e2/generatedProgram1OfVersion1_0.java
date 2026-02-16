public class ApproximatePi {

    public static void main(String[] args) {
        double piApproximation1 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        double piApproximation2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));

        System.out.println("Approximation 1 of Pi: " + piApproximation1);
        System.out.println("Approximation 2 of Pi: " + piApproximation2);


        // More educational version, demonstrating the series expansion and how
        // adding more terms improves accuracy:

        double sum = 1.0;
        double sign = -1.0; // Start with subtraction for the 1/3 term
        double denominator = 3.0;

        System.out.println("Demonstrating the series expansion:");
        for(int i = 0; i < 6; i++){  // Calculate for 6 terms (up to 1/13)
            sum += sign * (1.0 / denominator);
            System.out.println("Approximation with " + (i+2) +" term(s) :"+ 4*sum); // Display intermediate results
            sign *= -1.0;  // Flip sign for next term
            denominator += 2.0; // Increment denominator by 2 for the next odd number
         
        }




    }
}

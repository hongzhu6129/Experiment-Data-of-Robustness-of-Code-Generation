public class ApproximatePi {

    public static void main(String[] args) {
        double sum1 = 1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0);
        double pi1 = 4.0 * sum1;

        double sum2 = 1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0);
        double pi2 = 4.0 * sum2;

        System.out.println("Approximation of pi with 6 terms: " + pi1);
        System.out.println("Approximation of pi with 7 terms: " + pi2);


        // More educational output showing the terms and how the sum develops
        System.out.println("\nDetailed calculation with 6 terms:");
        double currentSum = 1.0;
        System.out.println("Term 1: " + currentSum);
        currentSum -= (1.0/3.0);
        System.out.println("Term 2: " + currentSum);
        currentSum += (1.0/5.0);
        System.out.println("Term 3: " + currentSum);
        currentSum -= (1.0/7.0);
        System.out.println("Term 4: " + currentSum);
        currentSum += (1.0/9.0);
        System.out.println("Term 5: " + currentSum);
        currentSum -= (1.0/11.0);
        System.out.println("Term 6: " + currentSum);


        System.out.println("Multiplied by 4: " + 4 * currentSum);



    }
}

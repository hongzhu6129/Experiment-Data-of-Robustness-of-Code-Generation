public class EuclideanAlgorithm {

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     */
    public static int euclid(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EuclideanAlgorithm <integer1> <integer2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int gcd = euclid(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        }


    }
}

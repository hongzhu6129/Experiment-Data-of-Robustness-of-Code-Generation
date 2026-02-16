public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number is a well-known example. You can change this to search within a different range.

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break;  // Optimization: If a^3 is already larger than n, no need to continue.
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a + 1 to avoid duplicate pairs (e.g., 1^3 + 2^3 is the same as 2^3 + 1^3).
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: If the sum exceeds n, no need to check further values of b for this 'a'.
                }

                if (isSumOfTwoCubes(sum, a, b)) {
                    System.out.println(sum + " can be expressed as the sum of two cubes in at least two ways.");
                }
            }
        }
    }

    private static boolean isSumOfTwoCubes(int sum, int a, int b) {
        int count = 0; // Counter for the number of ways to express 'sum'

        for (int c = 1; c < a; c++) { // Check for smaller pairs of cubes.
            int c3 = c * c * c;
            int d3 = sum - c3;
            int d = (int) Math.round(Math.cbrt(d3)); // Calculate d efficiently

            if (d * d * d == d3 && d > 0) {
                count++;
                if(count >= 1) return true; // Found at least one other way 
            }
           
        }

         return false;
    }
}

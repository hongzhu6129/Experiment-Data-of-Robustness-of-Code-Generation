public class Ramanujan {

    public static void main(String[] args) {

        int n = 1729; //  You can change this value

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // Start b from a+1 to avoid duplicates
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break;  // Optimization: No need to check further if the sum exceeds n
                }

                if (sum <= n && isSumOfTwoCubes(sum, a, b)) {
                    System.out.println(sum);
                    return; // Exit after finding the first such number
                }

            }
        }
    }


    private static boolean isSumOfTwoCubes(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int i3 = i * i * i;
            if (i3 > n) {
                break;
            }
            int diff = n - i3;

            // Check if the difference is a perfect cube
            int cubeRoot = (int) Math.round(Math.cbrt(diff));
            if (cubeRoot * cubeRoot * cubeRoot == diff) {
                 // Avoid counting (a,b) and (b,a) as separate solutions, and avoid using the same values for both pairs.
                if (i != a && i != b && cubeRoot != a && cubeRoot != b) {
                    count++;
                }
            }
           
        }
        return count > 0; // Return true if there are two (or more) such pairs.
    }
}


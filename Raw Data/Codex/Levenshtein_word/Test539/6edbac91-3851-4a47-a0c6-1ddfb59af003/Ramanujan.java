public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number is a well-known example

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization:  a^3 cannot be greater than n
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates and ensure distinct pairs
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to continue if the sum exceeds n
                }

                if (isSumOfTwoCubesInAnotherWay(a, b, sum, n)) {
                    System.out.println(sum + " can be expressed as the sum of two cubes in more than one way.");
                    return; // Stop after finding the first such number
                }
            }
        }

       System.out.println("No such numbers found between 1 and " + n);
    }



    private static boolean isSumOfTwoCubesInAnotherWay(int a, int b, int sum, int n) {
        for (int c = 1; c <= n; c++) {
            int c3 = c * c * c;
            if (c3 > sum) break;  // Optimization

            for (int d = c + 1; d <= n; d++) {  // d starts from c+1 for distinct pairs
                int d3 = d * d * d;
                if (c3 + d3 > sum) break;

                if (c3 + d3 == sum && (c != a || d != b)) { // Check if the sum matches and pairs are different
                    return true;
                }
            }
        }
        return false;
    }
}

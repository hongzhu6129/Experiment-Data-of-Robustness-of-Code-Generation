public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change n to a larger value if needed

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) { // Ensure b > a to avoid duplicates

                int sum1 = a * a * a + b * b * b;
                if (sum1 > n) {
                    break; // Optimization: If the sum exceeds n, no need to continue with this b
                }


                for (int c = 1; c <= n; c++) {
                    for (int d = c + 1; d <= n; d++) { // Ensure d > c

                        int sum2 = c * c * c + d * d * d;

                        if (sum2 > n) {
                            break; // Optimization: If the sum exceeds n, no need to continue with this d
                        }


                        if (sum1 == sum2 && sum1 <= n && (a != c || b != d)) { //  Check if sum1 and sum2 are equal and distinct pairs
                            System.out.println(sum1 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                             return; //  If you only need to find one such number, exit after finding it.
                        }
                    }

                }


            }
        }


    }
}

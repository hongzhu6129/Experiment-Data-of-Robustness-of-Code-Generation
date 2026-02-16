public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value to explore other ranges

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to continue if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates and ensure distinct pairs
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) {
                    break;  // Optimization: No need to continue if the sum exceeds n
                }

                for (int c = a + 1; c <= n; c++) { // Finding another pair (c,d)
                    int c3 = c * c * c;
                    if (c3 > n) {
                        break; // Optimization
                    }

                    for (int d = c + 1; d <= n; d++) { // d starts from c + 1 for distinct pairs
                        int d3 = d * d * d;
                        if (c3 + d3 > n) {
                           break; // Optimization
                        }

                        if (sum == c3 + d3 && sum <= n) {
                            if (a != c && a != d && b != c && b != d) { // Ensure pairs are different
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                return; // Exit after finding one such number
                            }

                        }
                    }
                }
            }
        }
    }
}

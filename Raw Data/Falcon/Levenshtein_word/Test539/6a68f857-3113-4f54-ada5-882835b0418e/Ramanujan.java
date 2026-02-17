public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates and ensure distinct pairs
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to check further if the sum exceeds n
                }

                int count = 0;
                for (int c = 1; c < b; c++) {  // Inner loops to find other pairs
                    int c3 = c * c * c;

                    for (int d = c + 1; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 == sum) {
                            count++;
                            if (count == 1) { // Print only when a second representation is found
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            }
                        }
                    }
                }
            }
        }
    }
}

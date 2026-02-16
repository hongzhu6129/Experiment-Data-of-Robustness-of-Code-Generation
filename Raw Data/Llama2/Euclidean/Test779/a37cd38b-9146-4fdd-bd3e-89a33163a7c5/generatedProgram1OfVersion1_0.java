public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change n to explore other ranges

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            int count = 0;
            int prevB = -1; // To store the previous value of b

            for (int b = 1; b <= a; b++) {
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to check further if the sum exceeds n
                }

                int c = 1;
                while (true) {
                    int c3 = c * c * c;
                    int diff = sum - c3;
                    if (diff < 0) break;

                    int d = 1;
                    while (true) {
                        int d3 = d * d * d;

                        if (d3 > diff) break;

                        if (d3 == diff && c != a && c != b && d != a && d != b && c <= d) { // Check for distinct pairs
                            if (count == 0) {
                                prevB = b; // Store the first value of b
                            } else if (b != prevB) {  // Ensure at least two different pairs
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                return; // Exit after finding the first such number. If you want to find all such numbers within the range, remove this line.
                            }
                            count++;
                        }
                        d++;
                    }
                    c++;
                }


            }
        }
    }
}

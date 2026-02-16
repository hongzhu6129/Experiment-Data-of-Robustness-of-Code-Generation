public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;  // Optimization: a^3 exceeds n, no need to continue

            int count = 0;
            for (int b = 1; b < a; b++) { // Ensure distinct pairs (a, b) and (b, a) are not counted twice
                int b3 = b * b * b;

                int sum = a3 + b3;

                if (sum > n) break; // Optimization: sum exceeds n, no need to continue with this 'b'

                if (sum <= n) {

                    // Find if sum can be expressed as the sum of two other cubes (c, d)
                    for (int c = 1; c < a; c++) {
                        int c3 = c * c * c;
                        if (c3 > sum) break;  // Optimization:  no need to continue with this 'c'

                        for (int d = 1; d < c; d++) { // Ensure distinct pairs (c, d) and (d, c)
                            int d3 = d * d * d;
                            if (c3 + d3 > sum) break; // Optimization
                            if (c3 + d3 == sum ) {
                                if ((c != a && d != b)) { // Ensure pairs are distinct
                                    count++;
                                    if (count == 1) { // Print the number if found in at least two ways
                                        System.out.println(sum + " can be expressed as the sum of two cubes in two different ways:");
                                        System.out.println(a + "^3 + " + b + "^3 = " + sum);
                                        System.out.println(c + "^3 + " + d + "^3 = " + sum);
                                    } else {
                                         System.out.println(c + "^3 + " + d + "^3 = " + sum);
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }


    }
}

public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number, the smallest such number.

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break; // Optimization: No need to continue if a^3 exceeds n

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates (e.g., 1^3 + 2^3 and 2^3 + 1^3)
                int b3 = b * b * b;
                if (a3 + b3 > n) break;  // Optimization

                int sum = a3 + b3;


                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > sum) break;  // Optimization

                    for (int d = c + 1; d <= n; d++) {
                        int d3 = d * d * d;

                        if (c3 + d3 > sum) break;  // Optimization

                        if (c3 + d3 == sum && (a != c || b != d)) {  //Found another pair (c, d) that sums to the same value!
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number
                        }
                    }

                }
            }
        }

    }
}

public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  The Hardy-Ramanujan number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break; // Optimization: No need to check further if a^3 exceeds n

            for (int b = a + 1; b <= n; b++) {  // Start b from a+1 to avoid duplicates and ensure distinct pairs
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) break; // Optimization: No need to check further if the sum exceeds n

                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > sum) break; // Optimization

                    for (int d = c + 1; d <= n; d++) {  // Ensure c and d are distinct
                        int d3 = d * d * d;
                        if (c3 + d3 > sum) break; // Optimization

                        if (sum == c3 + d3 && (a != c || b != d)) {
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number
                        }
                    }
                }
            }
        }
    }
}

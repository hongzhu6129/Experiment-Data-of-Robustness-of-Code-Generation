public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break; // Optimization:  If a^3 is already greater than n, no need to continue

            for (int b = a + 1; b <= n; b++) {  // Start b from a+1 to avoid duplicates
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) break; // Optimization: If a^3 + b^3 > n, no need to continue with this b

                // Now find another pair (c, d) such that c^3 + d^3 = sum
                for (int c = 1; c < b; c++) { // c must be less than b to avoid duplicates and ensure a different pair
                    int c3 = c * c * c;
                    int d3 = sum - c3;
                    int d = (int) Math.round(Math.pow(d3, 1.0 / 3.0)); // Calculate d as integer cube root

                    if (d > 0 && d * d * d == d3 && c != a && c != b && d != a && d != b ) {
                        //Check for perfect cube and ensure a different pair.
                        System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                        return; // Stop after finding the first such number 
                    }

                }
            }
        }
    }
}

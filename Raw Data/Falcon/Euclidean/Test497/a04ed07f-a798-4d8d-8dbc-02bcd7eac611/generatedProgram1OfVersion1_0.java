public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break; // Optimization: Stop when a^3 exceeds n

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) break; // Optimization: Stop when the sum exceeds n


                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > sum) break;

                    for (int d = c + 1; d <= n; d++) {
                        int d3 = d * d * d;

                        if (c3 + d3 == sum && (c != a || d != b) ) { // Ensure it's a different pair
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number (as per the prompt)
                        } else if (c3+d3 > sum) break;

                    }
                }

            }
        }
        System.out.println("No such number found up to " + n);
    }
}

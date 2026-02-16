public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // Start b from a+1 to avoid duplicates
                int b3 = b * b * b;
                if (a3 + b3 > n) {
                    break; // Optimization: No need to check further if a^3 + b^3 exceeds n
                }

                for (int c = a + 1; c <= n; c++) { // Again, start c from a+1
                    int c3 = c * c * c;
                    if (c3 > n) {
                        break;
                    }

                    for (int d = c + 1; d <= n; d++) {
                        int d3 = d * d * d;

                        if (a3 + b3 == c3 + d3 && a3 + b3 <= n) {
                            System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number.  Remove this line to find all numbers up to n.
                        }
                    }
                }
            }
        }

        System.out.println("No such number found up to " + n); // Print this if no such number is found.

    }
}

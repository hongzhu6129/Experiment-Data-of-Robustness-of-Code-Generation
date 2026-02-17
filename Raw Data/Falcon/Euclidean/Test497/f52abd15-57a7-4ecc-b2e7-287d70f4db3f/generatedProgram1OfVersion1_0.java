public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: If a^3 exceeds n, no need to continue
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates and ensure distinct pairs
                int b3 = b * b * b;
                if (a3 + b3 > n) {
                    break; // Optimization: If a^3 + b^3 exceeds n, no need to continue with this b
                }

                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > n) {
                       break;
                    }

                    for (int d = c + 1; d <= n; d++) { // d starts from c+1 for distinct pairs
                        int d3 = d * d * d;

                        if (c3 + d3 > n) {
                            break; 
                        }


                        if (a3 + b3 == c3 + d3 && a != c && a != d && b != c && b != d && a3 + b3 <= n ) {
                            System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number
                        }
                    }
                }
            }
        }

       
    }
}

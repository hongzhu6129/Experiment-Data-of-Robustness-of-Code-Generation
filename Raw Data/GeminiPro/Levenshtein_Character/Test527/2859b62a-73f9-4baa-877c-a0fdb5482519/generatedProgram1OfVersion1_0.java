public class RamanujanNumbers {

    public static void main(String[] args) {
        int n = 1729; // Example upper limit (Ramanujan's number)

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: a^3 exceeds n, no need to continue
            }

            int count = 0;
            for (int b = 1; b < a; b++) { // Ensure distinct pairs (b < a)
                int b3 = b * b * b;
                if (a3 - b3 <= 0 || a3 - b3 > n) { 
                    continue; // Check if within the desired range
                }

                int c3 = a3 - b3;
                int c = (int) Math.round(Math.cbrt(c3)); // Calculate cube root of the difference

                if (c * c * c == c3) { // Verify it's a perfect cube
                    for (int d = 1; d < c; d++) { // Find another pair
                        int d3 = d * d * d;

                        int e3 = c3 - d3;
                        if (e3 <= 0) {
                            continue;
                        }

                        int e = (int) Math.round(Math.cbrt(e3));
                        if (e * e * e == e3) {
                            if(d<e) { //avoid duplicates
                                count++;
                            }
                                
                        }

                    }

                }
            }
            if (count >=1 ) {
                System.out.println(a3); // Print if two pairs were found

            }

        }
    }
}

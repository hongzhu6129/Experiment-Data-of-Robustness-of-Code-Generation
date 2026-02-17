public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // Example: Ramanujan's number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            int count = 0;
            int prevB = 0; // Store the previous value of 'b' to check for distinct pairs

            for (int b = 1; b <= n; b++) {
                int b3 = b * b * b;

                if (a3 + b3 > n) {
                    break; // Optimization: No need to check further if a^3 + b^3 exceeds n
                }


                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > n) {
                        break;
                    }

                    for (int d = 1; d <= n; d++) {

                        if (c==a && d==b) continue; // Skip the identical pair
                        if (c==b && d==a) continue;

                        int d3 = d * d * d;
                        if (c3 + d3 > n) {
                            break;
                        }

                        if (a3 + b3 == c3 + d3 ) {
                            if (count == 0 ) {
                                prevB = b;
                            } else if (c != a && c != b && d != a && d != b && d != prevB) { //check distinct pairs and avoid duplicates
                                System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                return; // Exit after finding the first such number
                            }
                            count++;
                            
                        }
                    }
                }
            }
        }
    }
}

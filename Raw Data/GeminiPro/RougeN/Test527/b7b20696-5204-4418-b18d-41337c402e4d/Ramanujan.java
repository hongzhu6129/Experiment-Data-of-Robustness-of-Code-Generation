public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // Example: Ramanujan's number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: a^3 exceeds n, no need to continue
            }

            int count = 0;
            for (int b = 1; b < a; b++) { // b < a to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: sum exceeds n, no need to continue with this b
                }


                for (int c = 1; c < a; c++) {
                    int c3 = c * c * c;

                    if (c3 > sum) {
                        break; //Optimization: c^3 exceeds sum, no need to continue
                    }


                    for (int d = c + 1; d < a; d++){ // Start d from c + 1 to avoid duplicate and ensure d is never equal to c.
                        int d3 = d * d * d;
                        
                         if (c3 + d3 > sum) {
                            break; // Optimization: sum exceeds target, no need to continue
                        }


                        if (c3 + d3 == sum) {
                            count++;
                            if (count >= 2) { // If we can form 'a' in two or more ways.
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                return; // Exit after finding the first such number
                            }

                            break; // Found a pair (c,d), break the loop
                        }


                    }
                }


            }
        }

    }
}

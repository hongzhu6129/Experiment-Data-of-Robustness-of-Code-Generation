public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number (or a larger value)

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to continue if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicates
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to continue if the sum exceeds n
                }


                int count = 0;
                for (int c = 1; c < b ; c++) {  // Find other pairs (c, d) where c^3 + d^3 == sum and c < d. Limit search to b for optimization
                    int c3 = c * c * c;
                    if(c3 >= sum){ // Optimization: No solution possible if c^3 itself is larger than the sum
                        break;
                    }

                    for (int d = c+1; d <= n ; d++) {
                        int d3 = d*d*d;
                        if(c3 + d3 == sum){
                             count++;
                        }
                        if(c3+d3 > sum) break; // Optimization: No solution possible if c^3 + d^3 is already larger than the sum
                    }

                }



                if (count > 0) { //Check if at least 1 other pair sums to the same number (Taxi cab number)
                    System.out.println(sum + " = " + a + "^3 + " + b + "^3");
                   
                   // Print the other pairs
                    for (int c = 1; c < b ; c++) {
                        int c3 = c * c * c;
                        if(c3 >= sum) break;
                        for (int d = c+1; d <= n ; d++) {
                            int d3 = d*d*d;
                            if(c3 + d3 == sum){
                                System.out.println("    = " + c + "^3 + " + d + "^3");
                            }
                            if(c3+d3 > sum) break;

                        }
                    }
                    return; // Exit after finding the first such number
                }
            }
        }
    }
}

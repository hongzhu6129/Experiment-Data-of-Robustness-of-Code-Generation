public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // Start b from a+1 to avoid duplicates
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to check further if the sum exceeds n
                }

                int count = 0;
                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;

                    if (c3 > sum) {
                        break; // Optimization
                    }


                    for (int d = c + 1; d <= n; d++) {  // Start d from c+1 to avoid duplicates and counting a,b as c,d.
                        int d3 = d * d * d;
                        if (c3 + d3 == sum) {
                            count++;
                        }
                        if (c3+d3 > sum) break;
                    }

                }



                if (count >= 1 ) {  // Found a number expressible as the sum of two cubes in two or more ways
                    
                    // Print out all the pairs for clarity.
                     System.out.print(sum + " = ");
                    for (int c = 1; c <= n; c++) {
                        int c3 = c * c * c;
                        if (c3 > sum) break;
                        for (int d = c + 1; d <= n; d++) {
                            int d3 = d * d * d;
                            if (c3 + d3 == sum) {
                                System.out.print(c + "^3 + " + d + "^3");
                                if (c + 1 < sum && d + 1 < sum) { // This is not optimal, but it works in most cases!
                                     System.out.print(" = "); 
                                }
                             }

                            if(c3+d3 > sum) break;
                        }


                    }




                    System.out.println(); // Move to the next line
                    //return; // Optional: If you only need to find one such number
                }
            }
        }
    }
}

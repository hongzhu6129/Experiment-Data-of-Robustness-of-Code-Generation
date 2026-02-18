public class RamanujanNumbers {

    public static void main(String[] args) {
        int n = 1729; // You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to continue if a^3 exceeds n
            }

            int count = 0;
            for (int b = 1; b < a; b++) {
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) {
                    break;  // Optimization: No need to continue if sum exceeds n
                }

                for (int c = 1; c < a; c++) {
                    for (int d = c + 1; d < a; d++) { // Ensure (c, d) and (d, c) are not counted as different
                        if (c * c * c + d * d * d == sum) {
                            count++;
                           
                        }

                    }
                }

              
            }


            if (count >= 1 ) {   // Change to >=2 if you are strictly looking for "two or *more*" ways.
                System.out.println(a3 + " ( + something) can be expressed as the sum of two cubes in two ways ");
                 for (int b = 1; b < a; b++) {
                    int b3 = b * b * b;
                    int sum = a3 + b3;
                     if (sum > n) {
                         break;
                     }
                     for (int c = 1; c < a; c++) {
                         for (int d = c + 1; d < a; d++) { 
                              if (c * c * c + d * d * d == sum) {
                                  System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                              }
                         }
                     }
                 }


            }
        }
    }
}

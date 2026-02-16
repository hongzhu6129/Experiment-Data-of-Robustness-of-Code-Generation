public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number, you can change this to a larger value

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) {
                    break; // Optimization: No need to check further if the sum exceeds n
                }

                int count = 0;
                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > sum) {
                        break; 
                    }

                    for (int d = c + 1; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > sum) {
                           break;
                        }

                        if (c3 + d3 == sum) {
                            count++;
                        }
                    }
                }
                if (count >= 2) {
                    System.out.println(sum + " can be expressed as the sum of two cubes in at least two ways.");
                    System.out.println(a + "^3 + " + b + "^3 = " + sum); // Show one example
                                   
                    
                    for (int c = 1; c <= n; c++) {
                         int c3 = c * c * c;
                          if (c3 > sum) {
                             break;
                          }
                      
                         for (int d = c + 1; d <= n; d++) {
                             int d3 = d * d * d;
                           if (c3 + d3 > sum) {
                                 break;
                             }

                             if (c3 + d3 == sum) {
                                 System.out.println(c + "^3 + " + d + "^3 = " + sum); // Show all the examples
                             }
                         }
                    }
                    
                    
                    
                    
                }
            }
        }
    }
}

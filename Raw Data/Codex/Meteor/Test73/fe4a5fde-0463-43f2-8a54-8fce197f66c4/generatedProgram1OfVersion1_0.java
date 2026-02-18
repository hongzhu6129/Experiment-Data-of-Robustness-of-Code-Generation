public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a * a + b * b * b;
                if (sum > n) break; // Optimization: No need to continue if the sum exceeds n

                int count = 0;
                for (int c = 1; c < a ; c++) {  // Avoid duplicate pairs (a,b) and (b,a) and (c,c)
                    for (int d = 1; d <= n; d++) { 
                        if (c * c * c + d * d * d == sum) {
                           count++;
                         
                        }
                        if (c * c * c + d* d* d > sum) {
                            break;
                        }


                    }
                }
                 if (count >0) {
                    System.out.println(sum + " = " + a + "^3 + " + b + "^3  " );
                   
                    for (int c = 1; c < a ; c++) {  // Avoid duplicate pairs (a,b) and (b,a)
                        for (int d = 1; d <= n; d++) { 
                            if (c * c * c + d * d * d == sum) {
                                System.out.println("    = " + c + "^3 + " + d + "^3");
                            }
                        
                        }
                    }
                     return; // Stop after finding the first such number
                 }
               
            }
        }
    }
}

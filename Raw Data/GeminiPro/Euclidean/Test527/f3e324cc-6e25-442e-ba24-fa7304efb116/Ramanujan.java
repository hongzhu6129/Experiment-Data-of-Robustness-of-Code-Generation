public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // Example: Ramanujan's number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to check further if a^3 exceeds n
            }

            int count = 0;
            int prevB = -1; // Keep track of the previous 'b' value

            for (int b = 1; b <= n; b++) {
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break; // Optimization: No need to check further if the sum exceeds n
                }

                if (sum <= n) {
                  for (int c = 1; c <= n; c++) {
                     if (c==a || c==b) continue;
                     int c3 = c*c*c;

                     for(int d = c+1; d <= n; d++){
                          if(d==a || d==b) continue;
                          int d3 = d*d*d;
                           
                          if (sum == c3 + d3) {
                              if(count > 0 && (c != prevB)) {
                                 System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                 return; // Found a number with two representations, exit
                              } 
                              count++;
                              prevB = b;
                              
                           }
                     }
                 }
               }
            }
        }
    }
}

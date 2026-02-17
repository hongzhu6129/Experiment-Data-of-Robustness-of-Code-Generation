public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to continue if a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // Start b from a+1 to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break;  // Optimization: No need to continue if the sum exceeds n
                }

                int count = 0;
                for (int c = 1; c < b; c++) { // Find other pairs that sum to the same value
                    int c3 = c * c * c;
                    if (c3 > sum) {
                        break; 
                    }
                    int d3 = sum - c3;
                    int d = (int) Math.round(Math.pow(d3, 1.0/3.0)); // Calculate the cube root

                    if (d * d * d == d3 && c != a && c != b && d != a && d != b ) { 
                      if (c > d){
                        int temp = c;
                        c = d;
                        d = temp;
                      }


                      count++;
                        if(count == 1 ){  // If we have found another pair that sums up to the same value
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            
                      }
                    }

                }

             }
        }
    }
}

public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number is 1729

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization:  Stop when a^3 exceeds n
            }

            int count = 0; // Counter for the number of ways to express 'a'
            for (int b = 1; b < a; b++) { // Ensure b < a to avoid duplicate pairs
                int b3 = b * b * b;
                int diff = a3 - b3;
                int c = (int) Math.round(Math.pow(diff, 1.0/3.0)); // Calculate potential c
                if (c * c * c == diff) {
                    
                    for (int d = 1; d < c; d++) { // Look for another pair (d,e) that sums to 'a'
                        int d3 = d * d * d;
                        int remainder = a3 - d3;
                        int e = (int) Math.round(Math.pow(remainder, 1.0 / 3.0));

                        if (e * e * e == remainder && d!=b) { // d and b must be different
                            count++;
                            break; // We only need to find one more pair
                        }
                        if(count>0) break;
                    }

                    
                }
                 if(count>0) break; // If a solution is found we are done for this a
            }


            if (count > 0) {
                System.out.println(a3);
                
            }
        }
    }
}

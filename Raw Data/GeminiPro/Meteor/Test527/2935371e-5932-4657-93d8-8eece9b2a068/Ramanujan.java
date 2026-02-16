public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change n to explore other ranges

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; // Optimization: No need to continue if a^3 exceeds n
            }

            int count = 0;
            int lastB = 0; // Keep track of the last 'b' value to avoid duplicates

            for (int b = 1; b <= n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n) {
                    break;  // Optimization
                }


                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;

                    if (a3 + b3 < c3) break; //optimization

                    for (int d = c + 1; d <= n; d++) { // Start d from c+1 to avoid duplicate pairs
                        int d3 = d * d * d;
                        if (a3 + b3 < d3) break; //optimization

                         if (a3 + b3 == c3 + d3 ) {

                            if (count == 0)
                            {
                                lastB = b;
                            }

                            if (b!= lastB){ //avoid counting duplicates from the inner loop
                                 if (count ==0){
                                    System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                 }
                                count++;
                            }
                        }
                    }
                }
            }


           
        }
    }
}

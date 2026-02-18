public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number

        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) { // b starts from a to avoid duplicates
                int sum = a * a * a + b * b * b;
                if (sum > n) {
                    break; // Optimization:  If the sum exceeds n, no need to continue with this b
                }

                int count = 0;
                for (int c = 1; c < b; c++) { // Find other pairs that sum to the same value
                    for (int d = c; d <= n; d++) {  // Ensure c <= d to avoid duplicates
                        if (c * c * c + d * d * d == sum ) {
                            count++;
                            if (count == 1) {  // Found two different ways
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                return; // Exit after finding the first such number
                            }
                        }

                        if (c * c * c + d * d * d > sum){
                            break; // Optimization: If the sum exceeds, no need to continue with this d
                        }
                    }
                }
            }
        }

       
    }
}

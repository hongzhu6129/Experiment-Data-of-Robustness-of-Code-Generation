public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this to search up to a different limit

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {  // b starts from a+1 to avoid duplicate pairs
                int sum = a * a * a + b * b * b;
                if (sum > n) break; // Optimization: No need to continue if the sum exceeds n

                int count = 0;
                for (int c = 1; c < b; c++) {   // c < b to ensure different pairs
                    for (int d = c + 1; d <= n; d++) {
                        if (c * c * c + d * d * d == sum) {
                            count++;
                            if (count == 1) { // Found the second way to express the sum
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                // If you only want to find *one* such number, exit here:
                                // return; 
                            }
                        }
                    }
                }
            }
        }
    }
}

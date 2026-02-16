public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // Example value, you can change this

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) { // Ensure b > a to avoid duplicate pairs
                int sum = a * a * a + b * b * b;

                if (sum <= n) {
                    int count = 0;
                    for (int c = 1; c < b ; c++) { // Iterate through potential pairs (c,d) where c<b to prevent duplicates
                        for (int d = c + 1; d <= n; d++) { // Ensure d > c to avoid duplicate pairs within the inner loop

                            if (c * c * c + d * d * d == sum) {
                                count++;
                                if(count >=1 && (c !=a || d!=b) ){ //Check if at least two pairs exist for the current sum and avoid duplicate
                                    System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                    return; // Exit after finding the first such number
                                }
                            }
                        }

                    }
                    

                }
            }
        }
    }
}

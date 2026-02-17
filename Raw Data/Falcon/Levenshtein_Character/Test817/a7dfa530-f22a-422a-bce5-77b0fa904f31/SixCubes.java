public class SixCubes {

    public static void main(String[] args) {
        int n = 10000; // Adjust the upper limit as needed

        // Create an array to store the number of ways each number can be expressed as a sum of six cubes.
        int[] count = new int[n + 1];

        // Pre-compute the cubes of numbers up to the sixth root of n.
        int limit = (int) Math.cbrt(n) + 1; 
        int[] cubes = new int[limit + 1];
        for (int i = 1; i <= limit; i++) {
            cubes[i] = i * i * i;
        }

        // Iterate through all possible combinations of six cubes and increment the count for the corresponding sum.
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                for (int c = b; c <= limit; c++) {
                    for (int d = c; d <= limit; d++) {
                        for (int e = d; e <= limit; e++) {
                            for (int f = e; f <= limit; f++) {
                                int sum = cubes[a] + cubes[b] + cubes[c] + cubes[d] + cubes[e] + cubes[f];
                                if (sum <= n) {
                                    count[sum]++;
                                }
                            }
                        }
                    }
                }
            }
        }

        // Find the smallest number with at least two representations.
        for (int i = 1; i <= n; i++) {
            if (count[i] >= 2) {
                System.out.println("The smallest number expressible as the sum of six cubes in two or more ways is: " + i);
                return; // Exit after finding the first such number.
            }
        }
        
        System.out.println("No number found within the specified range.");
    }
}

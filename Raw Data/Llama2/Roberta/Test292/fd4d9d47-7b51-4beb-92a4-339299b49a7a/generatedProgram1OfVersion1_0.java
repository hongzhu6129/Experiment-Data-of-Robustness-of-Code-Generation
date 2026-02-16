public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729 * 2; // Search up to twice Ramanujan's number

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int a = 1; a * a * a < i; a++) {
                for (int b = a + 1; a * a * a + b * b * b <= i; b++) {  // b starts from a+1 to avoid duplicates and ensure a <= b
                    if (a * a * a + b * b * b == i) {
                        count++;
                    }
                }
            }

            // Check for sums where a is different from b and include permutations. Since b always starts at a+1, we only need to count pairs where a and b are swapped as well.

            int countWithPermutations = 0;
            if (count > 0) { // Optimize: only calculate permutations if any solutions found

                for (int a = 1; a * a * a < i; a++) {
                    for (int b = a + 1; a * a * a + b * b * b <= i; b++) {  // b starts from a+1
                        if (a * a * a + b * b * b == i) {
                            countWithPermutations+=2; // Include (a, b) and (b, a), because they are distinct as long as a!=b. The original code didn't do this properly
                        }
                    }
                }                
            }
             if (countWithPermutations >= 6) { //Use the correct count
                 System.out.println(i + " can be expressed as the sum of two cubes in " + countWithPermutations + " ways.");
             }
        }
    }
}

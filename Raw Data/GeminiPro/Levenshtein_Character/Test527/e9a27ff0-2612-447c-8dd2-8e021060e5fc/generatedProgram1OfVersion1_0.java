public class SixCubes {

    public static void main(String[] args) {
        int n = 1730; // Ramanujan's number (1729 is the smallest)
        int maxCube = (int) Math.cbrt(n);

        // Create a table to store counts of sums of cubes
        int[] sumCounts = new int[n + 1];

        // Populate the table with counts
        for (int i = 1; i <= maxCube; i++) {
            for (int j = i; j <= maxCube; j++) {
                for (int k = j; k <= maxCube; k++) {
                    for (int l = k; l <= maxCube; l++) {
                        for (int m = l; m <= maxCube; m++) {
                            for (int p = m; p <= maxCube; p++) {
                                int sum = i * i * i + j * j * j + k * k * k + l * l * l + m * m * m + p * p * p;
                                if (sum <= n) {
                                    sumCounts[sum]++;
                                }
                            }
                        }
                    }
                }
            }
        }


        // Find and print numbers that can be expressed as the sum of six cubes in two or more ways
        for (int i = 1; i <= n; i++) {
            if (sumCounts[i] >= 2) {
                System.out.println(i + " can be expressed as the sum of six cubes in at least two ways.");
                break; // Stop after finding the first such number (or remove break to find all).
            }
        }

    }
}

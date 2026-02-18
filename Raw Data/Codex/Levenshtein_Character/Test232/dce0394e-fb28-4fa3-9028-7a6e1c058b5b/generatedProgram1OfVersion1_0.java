public class Prime2DArray {

    public static int prime_cell(int i, int j) {
        // Check if i is prime
        boolean iIsPrime = true;
        if (i <= 1) {
            iIsPrime = false;
        } else {
            for (int k = 2; k * k <= i; k++) {
                if (i % k == 0) {
                    iIsPrime = false;
                    break;
                }
            }
        }

        // Check if j is prime
        boolean jIsPrime = true;
        if (j <= 1) {
            jIsPrime = false;
        } else {
            for (int k = 2; k * k <= j; k++) {
                if (j % k == 0) {
                    jIsPrime = false;
                    break;
                }
            }
        }

        // Return 0 if both i and j are prime, 1 otherwise
        return (iIsPrime && jIsPrime) ? 0 : 1; 
    }


    public static void main(String[] args) {
        int m = 3; // Example size, you can change this
        boolean[][] a = new boolean[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (prime_cell(i, j) == 1); // Set to true if NOT both prime
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

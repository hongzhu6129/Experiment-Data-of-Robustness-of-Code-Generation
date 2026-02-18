public class MagicSquareGenerator {

    public static void main(String[] args) {
        int n = 5; // Example order of the magic square

        if (n % 2 == 0) {
            System.out.println("Even order magic squares are not supported by this simple method.");
            return;
        }

        int[][] magicSquare = generateMagicSquare(n);

        // Print the magic square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            magicSquare[row][col] = num;
            num++;

            int nextRow = (row - 1 + n) % n;
            int nextCol = (col + 1) % n;

            if (magicSquare[nextRow][nextCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        return magicSquare;
    }
}

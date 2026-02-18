public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] sophisticated = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 7;
        int m = sophisticated.length;
        int n = sophisticated[0].length;

        int[] position = Saddleback(sophisticated, target, m, n);

        if (position != null) {
            System.out.println("Target " + target + " found at row: " + position[0] + ", column: " + position[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int[] Saddleback(int[][] sophisticated, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (sophisticated[row][col] == target) {
                return new int[]{row, col}; // Target found
            } else if (sophisticated[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }

        return null; // Target not found
    }
}

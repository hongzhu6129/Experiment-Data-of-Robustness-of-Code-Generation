public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int m = arr.length;
        int n = arr[0].length;

        int target = 7;

        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found.");
        }


        target = 20; // Test for a value not in the array
        result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}

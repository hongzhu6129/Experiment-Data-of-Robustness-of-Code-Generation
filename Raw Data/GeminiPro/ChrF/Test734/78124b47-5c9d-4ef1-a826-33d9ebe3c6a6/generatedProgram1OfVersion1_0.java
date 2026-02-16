public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int m = arr.length;
        int n = arr[0].length;

        int target = 5;
        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }


        target = 10; // Test with a number not in the array
        result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }

    }


    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Found the target
            } else if (arr[row][col] < target) {
                row++; // Target is greater, move down to the next row
            } else {
                col--; // Target is smaller, move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Target not found

    }
}

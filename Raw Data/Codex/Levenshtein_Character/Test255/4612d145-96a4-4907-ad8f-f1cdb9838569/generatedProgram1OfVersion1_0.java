public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int m = arr.length;
        int n = arr[0].length;

        int target = 16;
        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }


        target = 20; // Example with a target that's not present
        result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;
        int[] result = {-1, -1}; // Default: not found

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                result[0] = row;
                result[1] = col;
                return result; // Target found
            } else if (arr[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }

        return result; // Target not found
    }
}





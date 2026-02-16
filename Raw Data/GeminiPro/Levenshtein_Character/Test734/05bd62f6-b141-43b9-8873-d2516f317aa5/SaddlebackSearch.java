public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 21;
        int m = arr.length;
        int n = arr[0].length;

        int[] result = Saddleback(arr, target, m, n);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        target = 50;  // Test with a value not in the array
        result = Saddleback(arr, target, m, n);
        if (result[0] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

    }



    private static int[] Saddleback(int[][] arr, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Element found
            } else if (arr[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Element not found
    }
}

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

        int[] result = Saddleback(arr, target, m, n);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        target = 17; // Test with a value not present
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

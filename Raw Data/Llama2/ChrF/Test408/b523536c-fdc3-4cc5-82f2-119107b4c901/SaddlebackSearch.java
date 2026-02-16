public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        int m = arr.length;
        int n = arr[0].length;


        int[] result = Saddleback(arr, target, m, n);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }


    private static int[] Saddleback(int[][] arr, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Found the target
            } else if (arr[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }

        return new int[]{-1, -1}; // Target not found

    }
}

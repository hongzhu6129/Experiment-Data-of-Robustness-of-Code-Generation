public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 9, 12}
        };
        int m = arr.length;
        int n = arr[0].length;

        int target = 8;
        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        target = 15; // Example with an element not present
        result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Element found
            } else if (arr[row][col] < target) {
                row++; // Move down (element is larger in next row)
            } else {
                col--; // Move left (element is smaller in previous column)
            }
        }

        return new int[]{-1, -1}; // Element not found
    }
}

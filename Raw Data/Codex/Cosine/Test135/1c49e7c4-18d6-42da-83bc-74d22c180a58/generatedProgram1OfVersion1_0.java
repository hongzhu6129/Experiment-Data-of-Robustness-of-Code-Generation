import java.util.Arrays;

public class SpiralArraySearch {

    public static void main(String[] args) {
        int[][] spiralArray = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };

        int m = spiralArray.length;
        int n = spiralArray[0].length;

        int target = 25;

        int[] position = Saddleback(spiralArray, m, n, target);

        if (position[0] != -1 && position[1] != -1) {
            System.out.println("Target " + target + " found at row: " + position[0] + ", column: " + position[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

         target = 26; // Test with a number not in the array
        position = Saddleback(spiralArray, m, n, target);

        if (position[0] != -1 && position[1] != -1) {
            System.out.println("Target " + target + " found at row: " + position[0] + ", column: " + position[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }


    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = 0;

        while (row < m && col < n) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Found the target
            }

            // Move right along the top row
            while (col + 1 < n && arr[row][col + 1] != -1 ) {  // Assuming  visited elements could be marked as -1 in a true saddleback search. We don't modify the array here for simplicity.
                if (arr[row][col+1] == target){
                    return new int[]{row, col+1};
                }
               col++;

            }


            row++; // Move down

            if (row>=m) break; // Check bounds as we have moved down
            if (arr[row][col]==target){
               return new int[] {row, col};
            }

            // Move down along the rightmost column
            while (row + 1 < m  && arr[row + 1][col] != -1) {
                if (arr[row+1][col] == target){
                    return new int[]{row+1, col};
                }
                row++;

            }


            col--; // Move left
            if(col<0) break; //Check bounds
             if (arr[row][col]==target){
               return new int[] {row, col};
            }
            // Move left along the bottom row
             while (col-1 >= 0 && arr[row][col - 1] != -1) {
                 if (arr[row][col-1] == target){
                    return new int[]{row, col-1};
                }
                 col--;
             }


             row--; //Move Up
             if(row < 0) break;  // Check bounds
             if (arr[row][col]==target){
               return new int[] {row, col};
            }

            // Move up along the leftmost column
             while(row-1>=0 && arr[row-1][col] != -1){
                if (arr[row-1][col] == target){
                    return new int[]{row-1, col};
                }
                row--;

             }
            col++;


        }

        return new int[]{-1, -1}; // Target not found
    }
}

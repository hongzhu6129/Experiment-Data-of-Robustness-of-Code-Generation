import java.util.Arrays;

public class BeadSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 2};
        System.out.println("Original Array:");
        display1D(arr);

        int[] sortedArr = beadSort(arr);
        System.out.println("\nSorted Array:");
        display1D(sortedArr);


        // Demonstrating other display methods (not essential for bead sort, but included as per the requirements)
        char[] charArr = {'a', 'b', 'c'};
        System.out.println("\nCharacter Array:");
        display1D(charArr);

        char[][] char2DArr = {{'x', 'y'}, {'z', 'w'}};
        System.out.println("\n2D Character Array:");
        display2D(char2DArr);


    }

    public static int[] beadSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Return empty array for null or empty input
        }


        int max = Arrays.stream(arr).max().orElse(0);
        int n = arr.length;

        char[][] grid = new char[max][n];
        for (char[] row : grid) {
            Arrays.fill(row, '-'); // Initialize with '-' for empty space
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++) {
                grid[j][i] = '*';  // Represent beads
            }
        }


        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < max; j++) {
                if (grid[j][i] == '*') {
                    count++;
                }
            }
            sortedArr[i] = count;
        }

        return sortedArr;
    }

    public static void display1D(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void display1D(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void display2D(char[][] arr) {
        for (char[] row : arr) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}

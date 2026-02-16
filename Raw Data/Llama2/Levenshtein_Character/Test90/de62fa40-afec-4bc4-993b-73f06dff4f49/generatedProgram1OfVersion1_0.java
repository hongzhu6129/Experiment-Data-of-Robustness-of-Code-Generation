import java.util.Arrays;

public class BeadSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 2};

        System.out.println("Original array:");
        display1D(arr);

        int[] sortedArr = beadSort(arr);

        System.out.println("\nSorted array:");
        display1D(sortedArr);


        // Example usage of other display methods
        char[] charArray = {'a', 'b', 'c'};
        display1D(charArray);

        char[][] char2DArray = {{'a', 'b'}, {'c', 'd'}};
        display2D(char2DArray);


    }

    public static int[] beadSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Return empty array for null or empty input
        }

        int max = Arrays.stream(arr).max().orElse(0); // Handle empty array

        char[][] grid = new char[arr.length][max];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                grid[i][j] = '*'; // Represent beads
            }
        }

        // Simulate beads falling
        for (int j = 0; j < max; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (grid[i][j] == '*') {
                    count++;
                    grid[i][j] = ' '; // Remove the bead 
                }
            }
             for(int i=arr.length-1; i>=arr.length-count;i--) { // Add it at the bottom
                 grid[i][j] = '*';
             }
        }

        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < max; j++) {
                if (grid[i][j] == '*') {
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

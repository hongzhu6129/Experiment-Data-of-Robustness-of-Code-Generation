public class CheckFirstLast {

    public static void main(String[] args) {

        int[][] arrays = {
                {1, 2, 3, 4, 1},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 10},
                {14, 15, 16, 17, 14},
                {18, 19, 20, 21, 22}
        };

        for (int i = 0; i < arrays.length; i++) {
            int[] currentArray = arrays[i];

            if (currentArray.length > 0 && currentArray[0] == currentArray[currentArray.length - 1]) {
                System.out.println("Array " + (i + 1) + ": First and last elements are the same.");
            } else {
                System.out.println("Array " + (i + 1) + ": First and last elements are NOT the same.");
            }
        }
    }
}

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        quickSort(0, inputArr.length - 1, inputArr);
    }

    private void quickSort(int lowerIndex, int higherIndex, int[] array) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In this loop, you decrement j while array[j] is greater than pivot
             * and increment i while array[i] is less than pivot.
             * At the end, swap array[i] and array[j] to ensure
             * elements smaller than pivot are on its left, and larger elements are on its right.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j, array);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j, array);
        if (i < higherIndex)
            quickSort(i, higherIndex, array);
    }

    private void exchangeNumbers(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        QuickSort sorter = new QuickSort();
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sorter.sort(input);
        System.out.println(Arrays.toString(input)); // Output: [2, 2, 12, 20, 24, 45, 53, 56, 56, 75, 99]

        // Test with an empty array
        int[] emptyArray = {};
        sorter.sort(emptyArray);
        System.out.println(Arrays.toString(emptyArray)); // Output: []

        // Test with a null array
        int[] nullArray = null;
        sorter.sort(nullArray); // Should not throw any exceptions
        System.out.println(Arrays.toString(nullArray)); // Output: null


    }
}

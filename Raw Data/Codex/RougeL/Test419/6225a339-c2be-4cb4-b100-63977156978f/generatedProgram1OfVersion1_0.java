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
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In quickSort, we are dividing the array into two sub-arrays, the elements which are smaller than the pivot will be kept on the left side of the pivot, and the larger elements than the pivot will be placed on the right side of the pivot.
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
        int[] input = {24,2,45,20,55,97,4,74,1};
        sorter.sort(input);
        System.out.println(Arrays.toString(input)); // Output: [1, 2, 4, 20, 24, 45, 55, 74, 97]

        // Test with empty array
        int[] emptyArray = {};
        sorter.sort(emptyArray);
        System.out.println(Arrays.toString(emptyArray)); // Output: []

        // Test with null array
        int[] nullArray = null;
        sorter.sort(nullArray);  // Should not throw any exception
        System.out.println(Arrays.toString(nullArray == null ? new int[0] : nullArray)); // Output: []
        
        // Test with already sorted array
        int[] sortedArray = {1, 2, 3, 4, 5};
        sorter.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray)); // Output: [1, 2, 3, 4, 5]

        // Test with reverse sorted array
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        sorter.sort(reverseSortedArray);
        System.out.println(Arrays.toString(reverseSortedArray)); // Output: [1, 2, 3, 4, 5]
    }
}


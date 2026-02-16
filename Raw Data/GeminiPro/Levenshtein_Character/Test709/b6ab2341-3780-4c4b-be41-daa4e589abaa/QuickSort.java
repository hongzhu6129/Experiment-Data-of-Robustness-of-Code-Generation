import java.util.Arrays;

public class QuickSort {

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        quickSort(0, inputArr.length - 1, inputArr);
    }

    private void quickSort(int left, int right, int[] array) {
        int i = left;
        int j = right;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[left + (right - left) / 2];
        // Divide into two subarrays
        while (i <= j) {
            /**
             * In case small number is greater than pivot we will stop.
             */
            while (array[i] < pivot) {
                i++;
            }
            /**
             * In case large number is less than pivot we will stop.
             */
            while (array[j] > pivot) {
                j--;
            }
            /**
             * In case small number is greater than large number we will swap those two number
             * and then increment i and decrement j.
             */
            if (i <= j) {
                exchangeNumbers(i, j, array);
                //move index to next position on both arrays
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (left < j)
            quickSort(left, j, array);
        if (i < right)
            quickSort(i, right, array);
    }

    private void exchangeNumbers(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {

        QuickSort sorter = new QuickSort();
        int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
        sorter.sort(input);
        System.out.println(Arrays.toString(input)); // For easy printing to console

        // Example with an empty array
        int[] emptyArray = {};
        sorter.sort(emptyArray);
        System.out.println(Arrays.toString(emptyArray)); // Prints []

        // Example with a null array
        int[] nullArray = null;
        sorter.sort(nullArray); // Handles null gracefully; nothing is printed
    }
}

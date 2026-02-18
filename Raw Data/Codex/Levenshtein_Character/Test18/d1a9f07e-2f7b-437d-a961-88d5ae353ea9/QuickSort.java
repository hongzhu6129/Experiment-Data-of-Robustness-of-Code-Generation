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
        // Divide into two sub arrays
        while (i <= j) {
            /**
             * In this loop, you find a number from left side which is greater than
             * pivot, and also find a number from right side which is less than pivot. If both
             * numbers are found then you swap them and continue the same process until
             * whole array is divided in to two sub arrays with left side all elements less
             * than pivot and right side all elements greater than pivot.
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

        int[] input = {24,2,45,20,56,76,11,58,24,4,12};
        System.out.println("Before sorting : " + Arrays.toString(input));
        sorter.sort(input);
        System.out.println("After sorting : " + Arrays.toString(input));

         input = new int[]{1,5,2,9,10,4,7,3};
        System.out.println("Before sorting : " + Arrays.toString(input));
        sorter.sort(input);
        System.out.println("After sorting : " + Arrays.toString(input));
    }
}

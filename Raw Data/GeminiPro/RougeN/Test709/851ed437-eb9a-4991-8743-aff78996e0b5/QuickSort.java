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
             * As shown in the above image, In first iteration, we will select a pivot. Then
             * we will compare array[i] element with pivot, if array[i] element is greater
             * than pivot, then we will break the loop.
             */
            while (array[i] < pivot) {
                i++;
            }
            /**
             * As shown in the above image, In first iteration, we will select a pivot. Then
             * we will compare array[j] element with pivot, if array[j] element is less
             * than pivot, then we will break the loop.
             */
            while (array[j] > pivot) {
                j--;
            }
            /**
             * Now compare values of i and j, if i<=j then we will swap the array[i] and
             * array[j] element.
             */
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
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        System.out.println(Arrays.toString(input));
    }
}

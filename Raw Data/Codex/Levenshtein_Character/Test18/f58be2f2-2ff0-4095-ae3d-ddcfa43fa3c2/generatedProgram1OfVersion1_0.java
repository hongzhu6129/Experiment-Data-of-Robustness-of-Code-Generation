import java.util.Arrays;

public class QuickSort {

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        quickSort(0, inputArr.length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = inputArr[(lowerIndex + higherIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (inputArr[i] < pivot) {
                i++;
            }
            while (inputArr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = temp;
    }

     int[] inputArr; // Make inputArr a member variable

    public static void main(String[] args) {

        QuickSort sorter = new QuickSort();
        sorter.inputArr = new int[] {10, 7, 8, 9, 1, 5}; // Initialize inputArr
        sorter.sort(sorter.inputArr); // Pass inputArr to sort
        System.out.println(Arrays.toString(sorter.inputArr)); // Access sorted inputArr

        sorter.inputArr = new int[] { 24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(sorter.inputArr);
        System.out.println(Arrays.toString(sorter.inputArr));
    }
}

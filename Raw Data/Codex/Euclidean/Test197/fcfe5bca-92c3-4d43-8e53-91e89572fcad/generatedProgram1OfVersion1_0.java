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
             * In quickSort, we are dividing the array into two sub-arrays, and recursively sorting them. 
             * The pivot element is used to partition the array.
             *
             * The while loop continues as long as the left index (i) is less than or equal to the right index (j).
             *
             * The first inner while loop moves the left index (i) to the right until it finds an element that is greater than or equal to the pivot.
             *
             * The second inner while loop moves the right index (j) to the left until it finds an element that is less than or equal to the pivot.
             *
             * If i is still less than or equal to j, it means we have found two elements that are in the wrong place, so we swap them using exchangeNumbers(). Then we increment i and decrement j to continue the partitioning process.
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
        if (lowerIndex < j) {
            quickSort(lowerIndex, j, array);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex, array);
        }
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
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}

import java.util.Arrays;

public class PancakeSort {

    private int[] arr;

    public PancakeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void flip(int k) {
        for (int i = 0; i < k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }
    }

    public int[] minmax(int k) { //Finds index of max value in the prefix
        int maxIndex = 0;
        for (int i = 1; i < k; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
         return new int[] {maxIndex, arr[maxIndex]}; // return index and value for clarity

    }

    public void sort(int n, int current_size) { // Pancake sort recursive function
         if (current_size == 1)
             return;

         int[] maxResult = minmax(current_size);
         int maxIndex = maxResult[0];

        if (maxIndex != current_size - 1) {
            flip(maxIndex + 1); // Bring max element to front
            flip(current_size); // Put max element to its correct position
        }

        sort(n, current_size - 1); //Recursively sort rest of array

    }



    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        PancakeSort ps = new PancakeSort(arr);
        System.out.println("Unsorted array: " + ps);

        ps.sort(arr.length, arr.length );

        System.out.println("Sorted array: " + ps);


        int[] arr2 = {1, 5, 3, 9, 2};
        PancakeSort ps2 = new PancakeSort(arr2);
        System.out.println("Unsorted array: " + ps2);
        ps2.sort(arr2.length, arr2.length);
        System.out.println("Sorted array: " + ps2);
    }
}

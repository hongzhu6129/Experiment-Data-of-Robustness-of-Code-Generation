public class CocktailSort {

    void cocktailSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) {
            // Forward pass (like bubble sort)
            swapped = false;
            for (int i = start; i < end; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // If nothing moved, then array is sorted.
            if (!swapped)
                break;

            // Backward pass 
            swapped = false;
            end--; 
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void main(String[] args) {
        CocktailSort cs = new CocktailSort();
        int[] arr = {5, 1, 4, 2, 8, 0, 2};
        cs.cocktailSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

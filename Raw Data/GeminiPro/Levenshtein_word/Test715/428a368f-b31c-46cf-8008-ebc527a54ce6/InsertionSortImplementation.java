public class InsertionSortImplementation {

    void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSortImplementation sorter = new InsertionSortImplementation();
        int[] arr = {12, 11, 13, 5, 6};

        sorter.InsertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] arr2 = {5, 2, 4, 6, 1, 3}; // Example from prompt
        sorter.InsertionSort(arr2);
        System.out.println("Sorted array 2:");
         for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

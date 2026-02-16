public class MergeSortedArrays {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {2, 5, 8, 12};
        int[] arr2 = {1, 3, 7, 9, 10};

        int[] mergedArray = merge(arr1, arr2);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays while both have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}

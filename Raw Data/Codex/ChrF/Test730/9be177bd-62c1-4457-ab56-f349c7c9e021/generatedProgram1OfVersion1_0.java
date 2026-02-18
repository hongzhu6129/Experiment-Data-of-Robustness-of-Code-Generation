public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 8, 12};
        int[] arr2 = {1, 3, 7, 9, 10};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays while both have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}

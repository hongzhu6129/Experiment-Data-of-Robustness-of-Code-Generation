public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays while both have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from arr1
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy any remaining elements from arr2
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Example with different sized arrays and duplicates
        int[] arr3 = {1, 2, 3, 4, 4, 5};
        int[] arr4 = {2, 5, 6, 7, 8};

        int n3 = arr3.length;
        int n4 = arr4.length;
        int[] mergedArray2 = new int[n3 + n4];

        i = 0;
        j = 0;
        k = 0;


        while (i < n3 && j < n4) {
            if (arr3[i] <= arr4[j]) {
                mergedArray2[k++] = arr3[i++];
            } else {
                mergedArray2[k++] = arr4[j++];
            }
        }


        while (i < n3) {
            mergedArray2[k++] = arr3[i++];
        }

        while (j < n4) {
            mergedArray2[k++] = arr4[j++];
        }


        System.out.print("Merged Array 2: ");
        for (int num : mergedArray2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

public class CountDifferences {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 2, 5, 6};
        int count = countDifferences(arr1, arr2);
        System.out.println("Number of elements differing by 1 or less: " + count);


        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 4, 4, 5};  //Example with more matches
        count = countDifferences(arr3, arr4);
        System.out.println("Number of elements differing by 1 or less: " + count);


        int[] arr5 = {}; // Test with empty arrays
        int[] arr6 = {};
        count = countDifferences(arr5, arr6);
        System.out.println("Number of elements differing by 1 or less: " + count);

         int[] arr7 = {1, 2, 3}; // Test with different length arrays (should return 0)
        int[] arr8 = {1, 2, 3, 4};
        count = countDifferences(arr7, arr8);
        System.out.println("Number of elements differing by 1 or less: " + count);

    }

    public static int countDifferences(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return 0; // Handle null or unequal length arrays
        }

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int diff = Math.abs(arr1[i] - arr2[i]); // Get the absolute difference
            if (diff <= 1) {
                count++;
            }
        }
        return count;
    }
}

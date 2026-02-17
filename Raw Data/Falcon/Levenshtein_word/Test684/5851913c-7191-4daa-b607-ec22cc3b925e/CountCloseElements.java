public class CountCloseElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 2, 4, 5, 6};

        int count = countCloseElements(arr1, arr2);
        System.out.println("Number of elements differing by 1 or less: " + count);


        int[] arr3 = {1, 2, 3};
        int[] arr4 = {2, 3, 5};
        count = countCloseElements(arr3, arr4);
        System.out.println("Number of elements differing by 1 or less: " + count);

        int[] arr5 = {10, 20, 30, 40};
        int[] arr6 = {11, 19, 31, 39};
        count = countCloseElements(arr5,arr6);
        System.out.println("Number of elements differing by 1 or less: " + count);


    }


    public static int countCloseElements(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return -1; // Or throw an exception indicating invalid input
        }

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int diff = Math.abs(arr1[i] - arr2[i]); // Take the absolute difference.
            if (diff <= 1) {
                count++;
            }
        }
        return count;
    }
}

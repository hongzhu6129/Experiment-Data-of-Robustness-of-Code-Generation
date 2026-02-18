public class LargestOfThree {

    public static void main(String[] args) {
        // Example array (even length)
        int[] arr = {12, 5, 8, 25, 10, 3};

        if (arr == null || arr.length == 0 || arr.length % 2 != 0) {
            System.out.println("Invalid input array.");
            return;
        }


        int first = arr[0];
        int middle = arr[arr.length / 2 -1]; // Calculate middle index for even length array. For odd length, just arr.length/2 will work.
        int last = arr[arr.length - 1];

        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }

        System.out.println("Largest of first, middle, and last: " + largest);


         // Test with different arrays:
        int[] arr2 = {2, 8, 1, 9};
        findAndPrintLargest(arr2);

        int[] arr3 = {50, 10, 35, 60};
        findAndPrintLargest(arr3);
    }



    // Helper method to encapsulate the logic (good practice, even within main)
    public static void findAndPrintLargest(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 != 0) {
            System.out.println("Invalid input array.");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2 - 1 ];
        int last = arr[arr.length - 1];

        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }

        System.out.println("Largest of first, middle, and last: " + largest);
    }


}

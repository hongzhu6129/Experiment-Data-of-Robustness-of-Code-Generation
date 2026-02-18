public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        findLargest(arr1); // Output: 60 (last element)

        int[] arr2 = {5, 15, 25, 35, 45, 5};
        findLargest(arr2); // Output: 25 (middle element)

        int[] arr3 = {100, 20, 30, 40, 50, 60};
        findLargest(arr3); // Output: 100 (first element)



         int[] arr4 = {}; // Empty array case
        findLargest(arr4); // Output: Array is empty or not of even length


        int[] arr5 = {1,2,3,4,5}; // Odd length array case
        findLargest(arr5); // Output: Array is empty or not of even length

    }

    public static void findLargest(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 != 0) {
            System.out.println("Array is empty or not of even length");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2];
        int last = arr[arr.length - 1];

        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }

        System.out.println(largest);
    }
}

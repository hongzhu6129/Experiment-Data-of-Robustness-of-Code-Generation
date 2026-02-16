public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        findLargestOfThree(arr1); // Output: 60

        int[] arr2 = {5, 12, 8, 25, 1, 9};
        findLargestOfThree(arr2); // Output: 25


        int[] arr3 = {1, 2}; // Small even length array
        findLargestOfThree(arr3); // Output: 2

    }

    public static void findLargestOfThree(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 != 0) {
            System.out.println("Invalid input. Array must be even length and not empty.");
            return;
        }


        int first = arr[0];
        int last = arr[arr.length - 1];
        int middle = arr[arr.length / 2];


        int largest = first;
        if (last > largest) {
            largest = last;
        }
        if (middle > largest) {
            largest = middle;
        }

        System.out.println(largest);
    }
}

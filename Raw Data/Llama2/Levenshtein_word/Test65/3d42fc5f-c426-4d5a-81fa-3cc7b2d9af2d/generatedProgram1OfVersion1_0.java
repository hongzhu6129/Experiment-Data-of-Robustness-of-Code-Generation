public class LargestComparable {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {20, 30, 10};
        findLargestComparable(array1); // Output: 20

        int[] array2 = {10, 5, 25};
        findLargestComparable(array2); // Output: 25

        int[] array3 = {5, 15, 5};
        findLargestComparable(array3);  // Output: 5
    }

    public static void findLargestComparable(int[] arr) {
        if (arr == null || arr.length != 3) {
            System.out.println("Invalid input: Array must have length 3.");
            return;
        }

        int first = arr[0];
        int last = arr[2];

        if (first > last) {
            System.out.println(first);
        } else if (last > first) {
            System.out.println(last);
        } else {
            System.out.println(first); // Or last, they are equal
        }
    }
}

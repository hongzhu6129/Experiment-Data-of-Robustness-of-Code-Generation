public class LargestOfThree {

    public static void main(String[] args) {
        // Example array (even length)
        int[] arr = {10, 5, 25, 8, 15, 20};

        // Check if the array is valid (even length and at least 2 elements)
        if (arr == null || arr.length < 2 || arr.length % 2 != 0) {
            System.out.println("Invalid array.");
            return;
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        int middle = arr[arr.length / 2 -1 ];  // Adjust for 0-based indexing and even length

        // Find the largest using Math.max
        int largest = Math.max(first, Math.max(last, middle));

        System.out.println("Largest among first, middle, and last: " + largest);


        //Example using if/else (more verbose, but demonstrates the logic clearly)
        /*
        int largest;

        if (first >= last && first >= middle) {
            largest = first;
        } else if (last >= first && last >= middle) {
            largest = last;
        } else {
            largest = middle;
        }

        System.out.println("Largest among first, middle, and last: " + largest);
        */
    }
}

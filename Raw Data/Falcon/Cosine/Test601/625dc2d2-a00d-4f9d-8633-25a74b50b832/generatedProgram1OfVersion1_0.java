public class LargestFirstLast {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int largest1 = getLargestFirstLast(array1);
        System.out.println("Largest of first and last elements: " + largest1);


        int[] array2 = {5, 10, 2};
        int largest2 = getLargestFirstLast(array2);
        System.out.println("Largest of first and last elements: " + largest2);


        int[] array3 = {7, 7, 7};
        int largest3 = getLargestFirstLast(array3);
        System.out.println("Largest of first and last elements: " + largest3);
    }

    public static int getLargestFirstLast(int[] arr) {
        if (arr == null || arr.length < 1 ) {  // Handle invalid input
            return -1; // Or throw an exception, depending on your needs
        }

        if (arr.length == 1) {
            return arr[0];
        }
        // For an array of length 3 (or any length), compare first and last elements directly:

         return Math.max(arr[0], arr[arr.length - 1]);



    }
}

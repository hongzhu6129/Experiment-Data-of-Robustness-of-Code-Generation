public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray1 = {1, 2, 3, 4, 5};
        swapFirstLast(originalArray1);

        int[] originalArray2 = {10};
        swapFirstLast(originalArray2);


        int[] originalArray3 = {7,8,9,10};
        swapFirstLast(originalArray3);


        int[] originalArray4 =  {7};
        swapFirstLast(originalArray4);

    }

    public static void swapFirstLast(int[] arr) {
        if (arr == null || arr.length < 1) {
            System.out.println("Array must have at least one element.");
            return; // Or throw an exception as appropriate for your use case
        }

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;


        System.out.print("Swapped array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

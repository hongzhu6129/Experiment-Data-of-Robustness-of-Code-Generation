public class ArrayMerge {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int[] newArray = new int[2];

        newArray[0] = array1[0]; // First element of array1
        newArray[1] = array2[array2.length - 1]; // Last element of array2


        // Print the new array (optional - for verification)
        System.out.print("New Array: ");
        for (int element : newArray) {
            System.out.print(element + " ");
        }

    }
}

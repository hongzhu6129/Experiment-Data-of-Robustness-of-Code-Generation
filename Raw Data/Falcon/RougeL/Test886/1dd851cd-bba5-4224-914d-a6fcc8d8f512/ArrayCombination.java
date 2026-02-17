public class ArrayCombination {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] newArray = new int[2];

        newArray[0] = array1[0]; // First element of array1
        newArray[1] = array2[array2.length - 1]; // Last element of array2

        // Print the new array
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); 
    }
}

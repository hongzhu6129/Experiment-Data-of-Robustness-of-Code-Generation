import java.util.Arrays;

public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 4, 5, 6, 10, 7, 8, 9, 10, 11, 12};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 10, 10, 4, 5, 6, 10, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(createArrayAfter10(arr1))); // Output: [11, 12]
        System.out.println(Arrays.toString(createArrayAfter10(arr2))); // Output: []
        System.out.println(Arrays.toString(createArrayAfter10(arr3))); // Output: [11, 12]

    }

    public static int[] createArrayAfter10(int[] arr) {
        int last10Index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                last10Index = i;
            }
        }

        if (last10Index == -1 || last10Index == arr.length - 1) {
            // No 10 found or 10 is the last element.
            return new int[0]; 
        } else {
            // Create new array from elements after the last 10
            int newArrayLength = arr.length - (last10Index + 1);
            int[] newArray = new int[newArrayLength];
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = arr[last10Index + 1 + i];
            }
            return newArray;
        }
    }
}

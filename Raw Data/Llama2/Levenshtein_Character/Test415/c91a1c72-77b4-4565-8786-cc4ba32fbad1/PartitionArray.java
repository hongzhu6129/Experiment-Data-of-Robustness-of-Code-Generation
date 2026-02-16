import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);
        System.out.println(Arrays.toString(partitionedArr));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // Already partitioned
        int[] partitionedArr2 = partitionArray2(arr2);
        System.out.println(Arrays.toString(partitionedArr2));



        int[] arr3 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9}; // Reverse partitioned
        int[] partitionedArr3 = partitionArray2(arr3);
        System.out.println(Arrays.toString(partitionedArr3));


        int[] arr4 = {}; // Empty array
        int[] partitionedArr4 = partitionArray2(arr4);
        System.out.println(Arrays.toString(partitionedArr4));


         int[] arr5 = {1}; // Single element array
        int[] partitionedArr5 = partitionArray2(arr5);
        System.out.println(Arrays.toString(partitionedArr5));


        int[] arr6 = {2}; // Single even element array
        int[] partitionedArr6= partitionArray2(arr6);
        System.out.println(Arrays.toString(partitionedArr6));


    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception
        }

        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
         // Handle the case where all numbers are even or all numbers are odd
        if (evenIndex > oddIndex) { 
             return result;
        }
        
        // If evenIndex and oddIndex haven't crossed each other during the first loop
        // This happens if either all numbers are odd or all numbers are even
        // or there is a specific order like {2,4,6,8,1,3,5} or {1,3,5,2,4,6,8}
        // The following code swaps the leftover evens with the leftover odds

        for (int i = evenIndex, j = 0; i <= oddIndex; i++, j++) {
            if (result[i] % 2 == 1 && result[j] % 2 == 0 )
            {
              int temp = result[i];
              result[i] = result[j];
              result[j] = temp;  
            } 
        }



        return result;
    }
}

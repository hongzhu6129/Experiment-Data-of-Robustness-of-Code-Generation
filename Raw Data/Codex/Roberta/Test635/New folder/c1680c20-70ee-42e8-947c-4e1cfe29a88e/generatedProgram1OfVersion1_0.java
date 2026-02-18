public class Check20Triplet {

    public static void main(String[] args) {
        int[] arr1 = {20, 20, 20, 10, 5};
        System.out.println("Array 1: " + check20(arr1)); // Output: true

        int[] arr2 = {20, 20, 10, 20, 5};
        System.out.println("Array 2: " + check20(arr2)); // Output: false

        int[] arr3 = {20, 20, 20, 20, 5};
        System.out.println("Array 3: " + check20(arr3)); // Output: false

        int[] arr4 = {20, 10, 20, 20, 5};
        System.out.println("Array 4: " + check20(arr4)); // Output: false

        int[] arr5 = {10, 5, 20};
        System.out.println("Array 5: " + check20(arr5)); // Output: false

        int[] arr6 = {}; // Empty array
        System.out.println("Array 6: " + check20(arr6)); // Output: false


    }

    public static boolean check20(int[] arr) {
        int count = 0;
        boolean adjacentFound = false;

        if (arr == null || arr.length < 3) {
            return false; // Not enough elements for a triplet
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i < arr.length - 2 && arr[i+1] == 20 && arr[i+2] == 20) {
                    adjacentFound = true;
                    
                } 
            }
        }


        return count == 3 && adjacentFound;
    }
}

public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {1, 20, 3, 4, 20, 6, 7, 20}; // Valid
        int[] arr2 = {1, 20, 20, 3, 4, 5, 6, 20}; // Invalid (two 20s together)
        int[] arr3 = {1, 20, 3, 4, 5, 6, 7, 8}; // Invalid (not three 20s)
        int[] arr4 = {20, 1, 20, 3, 4, 20, 6, 7}; // Valid
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8};  // Invalid (no 20s)
        int[] arr6 = {20, 20, 20, 20, 1, 2, 3}; // Invalid (too many 20s and adjacent)

        System.out.println("arr1: " + check20s(arr1));
        System.out.println("arr2: " + check20s(arr2));
        System.out.println("arr3: " + check20s(arr3));
        System.out.println("arr4: " + check20s(arr4));
        System.out.println("arr5: " + check20s(arr5));
        System.out.println("arr6: " + check20s(arr6));
    }


    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) { // Check for adjacency
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent; // Return true if exactly three 20s and no adjacent 20s
    }
}

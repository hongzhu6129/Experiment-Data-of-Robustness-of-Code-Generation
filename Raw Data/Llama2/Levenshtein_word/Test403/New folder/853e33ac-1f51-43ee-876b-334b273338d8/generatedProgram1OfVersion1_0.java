public class Check20 {

    public static void main(String[] args) {
        int[] arr1 = {20, 5, 20, 10, 20}; // Valid
        int[] arr2 = {20, 20, 5, 20, 10}; // Invalid (adjacent 20s)
        int[] arr3 = {20, 5, 10, 20}; // Invalid (only two 20s)
        int[] arr4 = {20, 5, 20, 20, 20}; // Invalid (too many 20s and adjacent)
        int[] arr5 = {1,2,3,4,5};  // Invalid (no 20s)

        System.out.println("Array 1: " + check20s(arr1));
        System.out.println("Array 2: " + check20s(arr2));
        System.out.println("Array 3: " + check20s(arr3));
        System.out.println("Array 4: " + check20s(arr4));
        System.out.println("Array 5: " + check20s(arr5));
    }

    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) {
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}

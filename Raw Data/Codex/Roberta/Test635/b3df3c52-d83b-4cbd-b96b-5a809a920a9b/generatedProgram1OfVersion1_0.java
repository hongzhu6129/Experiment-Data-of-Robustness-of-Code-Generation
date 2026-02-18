public class Check20Occurrences {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 30, 20}; // Valid
        int[] arr2 = {20, 20, 10, 20, 30}; // Invalid (two 20s are adjacent)
        int[] arr3 = {20, 10, 20, 20, 20}; // Invalid (more than three 20s, and adjacent)
        int[] arr4 = {10, 20, 30, 40, 50}; // Invalid (not enough 20s)
        int[] arr5 = {20, 10, 20, 30, 40, 20}; // Valid


        System.out.println(check20(arr1)); // Output: true
        System.out.println(check20(arr2)); // Output: false
        System.out.println(check20(arr3)); // Output: false
        System.out.println(check20(arr4)); // Output: false
        System.out.println(check20(arr5)); // Output: true

    }

    public static boolean check20(int[] arr) {
        int count = 0;
        boolean adjacent = false; // Flag to track adjacent 20s

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) { //Check previous element (if it exists)
                    adjacent = true;
                    break; // No need to check further if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent; //Return true only if exactly three 20s and not adjacent
    }
}

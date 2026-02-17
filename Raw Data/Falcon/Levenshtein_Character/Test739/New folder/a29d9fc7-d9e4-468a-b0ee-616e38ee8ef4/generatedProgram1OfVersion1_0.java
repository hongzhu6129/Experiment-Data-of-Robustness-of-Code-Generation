public class Check20 {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 30, 20, 50}; // Valid
        int[] arr2 = {20, 20, 20, 30, 40};     // Invalid (adjacent 20s)
        int[] arr3 = {10, 20, 30, 40, 20};     // Invalid (only two 20s)
        int[] arr4 = {20, 20, 10, 20, 20, 30}; // Invalid (too many 20s and adjacent)

        System.out.println(check20(arr1)); // Output: true
        System.out.println(check20(arr2)); // Output: false
        System.out.println(check20(arr3)); // Output: false
        System.out.println(check20(arr4)); // Output: false
    }


    public static boolean check20(int[] arr) {
        int count = 0;
        boolean adjacent = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) {  //Check for adjacency
                    adjacent = true;
                    break; // No need to check further once adjacency found
                }

            }
        }

        return count == 3 && !adjacent;
    }
}

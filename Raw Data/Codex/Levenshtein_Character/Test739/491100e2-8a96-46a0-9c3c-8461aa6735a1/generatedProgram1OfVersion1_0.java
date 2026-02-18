public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {20, 5, 20, 10, 20};  // True
        int[] arr2 = {20, 20, 5, 20, 10}; // False (adjacent 20s)
        int[] arr3 = {20, 5, 10, 20};     // False (only two 20s)
        int[] arr4 = {20, 5, 20, 20, 20}; // False (too many 20s)


        System.out.println("arr1: " + checkTwenty(arr1));
        System.out.println("arr2: " + checkTwenty(arr2));
        System.out.println("arr3: " + checkTwenty(arr3));
        System.out.println("arr4: " + checkTwenty(arr4));


    }


    public static boolean checkTwenty(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;

                // Check for adjacency (but avoid index out of bounds)
                if (i > 0 && arr[i - 1] == 20) {
                    adjacent = true;
                    break;  // No need to continue if adjacent 20s found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}

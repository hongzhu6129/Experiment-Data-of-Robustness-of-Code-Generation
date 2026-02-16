class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 47, 51, 60, 78, 89};
        int target = 51;

        int index = Linear_Search(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        target = 100; // Test with an element not present
        index = Linear_Search(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    private static int Linear_Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }

        return -1; // Return -1 if the element is not found
    }
}

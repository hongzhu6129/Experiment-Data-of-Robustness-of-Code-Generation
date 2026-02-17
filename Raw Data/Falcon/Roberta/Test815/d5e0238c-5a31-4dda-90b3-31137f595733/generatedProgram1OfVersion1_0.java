class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int elementToSearch = 50;

        int index = Linear_Search(arr, elementToSearch);

        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }

         elementToSearch = 110; // Example with an element not present

        index = Linear_Search(arr, elementToSearch);

        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }

    private static int Linear_Search(int[] arr, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

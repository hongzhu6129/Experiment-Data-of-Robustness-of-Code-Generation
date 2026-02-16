public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int elementToFind = 12;

        int index = Linear_Search(array, elementToFind);

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }


        elementToFind = 25; // Search for an element not present
        index = Linear_Search(array, elementToFind);

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }

    private static int Linear_Search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

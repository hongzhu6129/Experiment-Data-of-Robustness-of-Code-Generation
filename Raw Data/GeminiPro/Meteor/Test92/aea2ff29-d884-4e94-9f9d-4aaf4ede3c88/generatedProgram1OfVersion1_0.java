public class CreateArrayAfterLastElement {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 4, 5, 6, 10, 7, 8, 9};
        int lastElement = 10;

        int lastElementIndex = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == lastElement) {
                lastElementIndex = i;
            }
        }

        if (lastElementIndex != -1 && lastElementIndex < originalArray.length - 1) {
            int newArrayLength = originalArray.length - lastElementIndex - 1;
            int[] newArray = new int[newArrayLength];

            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[lastElementIndex + 1 + i];
            }


            System.out.print("Original Array: ");
            printArray(originalArray);

            System.out.print("New Array: ");
            printArray(newArray);
        } else {
            System.out.println("Last element " + lastElement + " not found or is the last element in the array.");

        }
    }


    // Helper function to print the array elements (for cleaner output)
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 11, 12, 13, 10, 14, 15};
        int[] newArray = createArrayAfterLast10(originalArray);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else {
            System.out.println("No elements found after the last 10.");
        }


        originalArray = new int[]{1, 2, 3, 4, 5}; // Example with no 10
        newArray = createArrayAfterLast10(originalArray);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else {
            System.out.println("No elements found after the last 10.");
        }


         originalArray = new int[]{1, 2, 3, 10}; // Example where 10 is the last element
        newArray = createArrayAfterLast10(originalArray);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else {
            System.out.println("No elements found after the last 10.");
        }

    }


    public static int[] createArrayAfterLast10(int[] arr) {
        int lastIndex = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastIndex = i;
            }
        }

        // If 10 is not found or is the last element, return null or an empty array.
        if (lastIndex == -1 || lastIndex == arr.length - 1) {
            return null; // Or return new int[0]; for an empty array
        }

        // Create a new array with the elements after the last 10
        int newArrayLength = arr.length - lastIndex - 1;
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = arr[lastIndex + 1 + i];
        }

        return newArray;
    }
}

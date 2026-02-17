public class Main {

    public static void main(String[] args) {
        int[] originalArray1 = {1, 2, 3, 10, 12, 14};
        createNewArray(originalArray1); // Output: 12 14

        int[] originalArray2 = {1, 2, 3, 4, 5};
        createNewArray(originalArray2); // Output: (nothing, no 10 found)

        int[] originalArray3 = {1, 10, 2, 10, 3, 4, 5, 10, 6, 7};
        createNewArray(originalArray3); // Output: 6 7

        int[] originalArray4 = {1, 2, 3, 10}; // 10 is the last element
        createNewArray(originalArray4); // Output: (nothing, no elements after the last 10)


        int[] originalArray5 = {10, 1, 2, 3};  // 10 is the first element
        createNewArray(originalArray5); // Output: 1 2 3

        int[] emptyArray = {};
        createNewArray(emptyArray); // Handles empty array - no output


    }

    public static void createNewArray(int[] originalArray) {
        int lastIndexOfTen = -1;

        // Find the last index of 10
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                lastIndexOfTen = i;
            }
        }


        //If 10 exists and it's not the last element, create and print the new array
        if (lastIndexOfTen != -1 && lastIndexOfTen < originalArray.length - 1) {
            int newArrayLength = originalArray.length - (lastIndexOfTen + 1);
            int[] newArray = new int[newArrayLength];


            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[lastIndexOfTen + 1 + i];

            }

            // Print the elements of the newArray
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println(); // Newline for cleaner output

        } else {
           // Either no 10 found, or it's the last element, so no elements follow
        }

    }
}





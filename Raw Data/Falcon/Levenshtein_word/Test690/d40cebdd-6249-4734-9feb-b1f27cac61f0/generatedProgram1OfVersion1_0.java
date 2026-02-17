public class AfterTen {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 10, 12, 15, 2, 3, 10, 20, 25};

        // Find the index of the first occurrence of 10
        int startIndex = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                startIndex = i;
                break; // Exit the loop once the first 10 is found
            }
        }

        // Create the new array only if 10 is found
        if (startIndex != -1) {
            int newArrayLength = originalArray.length - (startIndex + 1);
            int[] newArray = new int[newArrayLength];
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[startIndex + 1 + i];
            }

            // Print the new array (for demonstration)
            System.out.print("New Array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();

        } else {
            System.out.println("10 not found in the original array.");
        }
    }
}

public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 5, 10, 12, 3, 8, 10, 25, 40, 15}; // Example array
        int last10Index = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                last10Index = i;
            }
        }

        // Create the new array if 10 exists
        if (last10Index != -1) {
            int newArrayLength = originalArray.length - (last10Index + 1);
            if (newArrayLength > 0) { //Check if there are elements after the last 10
                int[] newArray = new int[newArrayLength];
                for (int i = 0; i < newArrayLength; i++) {
                    newArray[i] = originalArray[last10Index + 1 + i];
                }


                // Print the new array (for verification)
                System.out.print("New Array: ");
                for (int num : newArray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("No elements found after the last 10.");
            }
            

        } else {
            System.out.println("10 not found in the original array.");
        }
    }
}

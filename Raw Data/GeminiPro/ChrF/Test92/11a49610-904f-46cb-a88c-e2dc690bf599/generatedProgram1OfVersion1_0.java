public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 5, 10, 12, 3, 7, 10, 8, 9, 2}; // Example array

        int last10Index = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                last10Index = i;
            }
        }

        // If 10 is not found, the new array will be empty
        if (last10Index == -1) {
            System.out.println("10 not found in the original array. New array is empty.");
            return; // Exit the program
        }

        // Calculate the length of the new array
        int newArrayLength = originalArray.length - (last10Index + 1);

        // If the last 10 is the last element, the new array will also be empty
        if(newArrayLength == 0) {
            System.out.println("10 is the last element. New array is empty.");
            return;
        }

        // Create the new array
        int[] newArray = new int[newArrayLength];


        // Populate the new array with elements after the last 10
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = originalArray[last10Index + 1 + i]; 
        }

        // Print the new array (for verification)
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println(); // New line for better output formatting
    }
}


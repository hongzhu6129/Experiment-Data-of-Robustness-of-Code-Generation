public class AfterTen {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 12, 15, 4, 6, 10, 20, 30, 10, 40, 50}; // Example array
        int lastTenIndex = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastTenIndex = i;
            }
        }

        // If 10 is found, create the new array
        if (lastTenIndex != -1 && lastTenIndex < arr.length -1) {
            int newArraySize = arr.length - (lastTenIndex + 1);
            int[] newArray = new int[newArraySize];
            int newIndex = 0;
            for (int i = lastTenIndex + 1; i < arr.length; i++) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
            

            // Print the new array (for verification)
            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("10 not found in the array or 10 is the last element.");
           // Optionally, you could create an empty array or handle it differently
           // if 10 isn't found or is the last element.  For example:
           // int[] newArray = new int[0]; //Empty array
        }
    }
}

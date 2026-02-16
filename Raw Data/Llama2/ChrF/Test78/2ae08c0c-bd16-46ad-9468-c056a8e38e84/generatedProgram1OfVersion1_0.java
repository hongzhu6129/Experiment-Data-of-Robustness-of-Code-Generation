public class AfterTen {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 4, 5, 6, 7, 10, 8, 9, 10}; // Example array

        int lastTenIndex = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastTenIndex = i;
            }
        }

        // If 10 is not found, print a message or handle it as needed
        if (lastTenIndex == -1) {
            System.out.println("10 not found in the array.");
            return; // Or handle it differently if you want to return an empty array, etc. 
        }

        // Calculate the size of the new array
        int newArraySize = arr.length - (lastTenIndex + 1);

        // If there are no elements after the last 10
        if (newArraySize <= 0) {
            System.out.println("No elements after the last 10.");
            return; // Or handle it as needed
        }

        // Create the new array
        int[] newArray = new int[newArraySize];

        // Populate the new array with elements after the last 10
        for (int i = 0; i < newArraySize; i++) {
            newArray[i] = arr[lastTenIndex + 1 + i];
        }


        // Print the new array (optional)
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

         // Another example
        int[] arr2 = {1, 2, 3, 4, 5}; // Array without 10
        lastTenIndex = -1;

        for(int i = 0; i< arr2.length; i++){
            if(arr2[i] == 10){
                lastTenIndex = i;
            }
        }

        if (lastTenIndex == -1) {
            System.out.println("10 not found in the array.");
            return; 
        }
    }
}





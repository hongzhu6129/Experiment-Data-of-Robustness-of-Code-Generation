public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 5, 10, 12, 3, 8, 10, 15, 20}; // Example array

        int last10Index = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                last10Index = i;
            }
        }

        // Create the new array if 10 exists
        if (last10Index != -1 && last10Index < originalArray.length -1 ) {  //Check if 10 exists AND isn't the last element
            int newArrayLength = originalArray.length - (last10Index + 1);
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
            System.out.println("No element after the last occurrence of 10 or 10 not found, or 10 is the last element."); //Handles cases where there's no element after 10
        }

        // Example with no 10 in the array:
        int[] originalArray2 = {1, 2, 3, 4, 5};
        last10Index = -1;
        for (int i = 0; i < originalArray2.length; i++) {
            if (originalArray2[i] == 10) {
                last10Index = i;
            }
        }
        if (last10Index != -1 && last10Index < originalArray2.length -1) { //Check if 10 exists AND isn't the last element
           // (Rest of the logic as above would go here, but is omitted for brevity)
        }  else {
            System.out.println("No element after the last occurrence of 10 or 10 not found, or 10 is the last element.");
        }


        // Example with 10 as the last element:
        int[] originalArray3 = {1, 2, 3, 4, 10};
        last10Index = -1;
        for (int i = 0; i < originalArray3.length; i++) {
            if (originalArray3[i] == 10) {
                last10Index = i;
            }
        }
        if (last10Index != -1 && last10Index < originalArray3.length -1) {  //Check if 10 exists AND isn't the last element
            //(Rest of the logic as above would go here, but is omitted for brevity)
        } else {
            System.out.println("No element after the last occurrence of 10 or 10 not found, or 10 is the last element.");
        }
    }
}




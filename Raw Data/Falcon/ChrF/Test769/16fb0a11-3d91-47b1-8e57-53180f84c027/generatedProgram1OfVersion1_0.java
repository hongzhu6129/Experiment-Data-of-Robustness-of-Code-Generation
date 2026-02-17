public class Main {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 4, 5, 6, 7, 10, 8, 9}; // Example array
        int lastIndexOf10 = -1;

        // Find the last index of 10
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                lastIndexOf10 = i;
            }
        }

        // Create the new array if 10 exists
        if (lastIndexOf10 != -1 && lastIndexOf10 < originalArray.length -1 ) { 
            int newArrayLength = originalArray.length - (lastIndexOf10 + 1);
            int[] newArray = new int[newArrayLength];

            // Copy elements after the last 10
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[lastIndexOf10 + 1 + i];
            }

            // Print the new array (for demonstration)
            System.out.print("New array: ");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }  else if (lastIndexOf10 == originalArray.length -1){
             System.out.println("New array: "); //Output empty line if 10 is the last element
        }
        else{
            System.out.println("10 is not found in the array.");
        }
    }
}

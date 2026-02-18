public class CreateArrayWithoutLast10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 10}; // Example array

        int last10Index = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                last10Index = i;
            }
        }

        if (last10Index != -1) {  // Check if 10 exists in the array
            int[] newArray = new int[last10Index];
            for (int i = 0; i < last10Index; i++) {
                newArray[i] = originalArray[i];
            }

            // Print the new array (optional, but useful for verification)
            System.out.print("New Array: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("The original array does not contain the value 10.");

            //If you still want a copy excluding a non-existent 10, uncomment below
           /* int[] newArray = new int[originalArray.length];
            System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
            System.out.print("Copied Array (10 not found): ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();*/


        }
    }
}

public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 4, 5, 6, 10, 7, 8, 9};

        int lastIndexOf10 = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                lastIndexOf10 = i;
            }
        }

        if (lastIndexOf10 != -1 && lastIndexOf10 < originalArray.length - 1) {
            int newArrayLength = originalArray.length - (lastIndexOf10 + 1);
            int[] newArray = new int[newArrayLength];
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[lastIndexOf10 + 1 + i];
            }

            // Print the new array (optional, just to see the result)
            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        } else {
            System.out.println("No elements after the last 10.");


            if (lastIndexOf10 == -1) {
                // Handle the case where 10 isn't present at all (optional)

                System.out.println("10 is not found in the array.");

                int[] newArray = new int[0]; // Create an empty array if you need to return something
               //  (Alternative: you could also just do nothing in this specific scenario).

               // Print the new array (which is empty)
               System.out.print("New array (empty): ");
               for (int num : newArray) {
                   System.out.print(num + " ");
               }
               System.out.println(); 

           }

        }
    }
}

public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 4, 5, 6, 10, 7, 8, 9};
        int[] newArray = createArrayAfterLast10(originalArray);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("No element 10 found in the original array or no elements after the last 10.");
        }


        // Another test case:
        int[] originalArray2 = {1, 2, 3, 4, 5};  // No 10
         newArray = createArrayAfterLast10(originalArray2);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("No element 10 found in the original array or no elements after the last 10.");
        }



        // Another test case:
        int[] originalArray3 = {1, 2, 3, 10}; // 10 is the last element.
         newArray = createArrayAfterLast10(originalArray3);

        if (newArray != null) {
            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("No element 10 found in the original array or no elements after the last 10.");
        }

    }


    public static int[] createArrayAfterLast10(int[] arr) {
        int last10Index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                last10Index = i;
            }
        }

        if (last10Index == -1 || last10Index == arr.length - 1) {  // No 10 found or 10 is the last element
            return null; 
        }


        int newArrayLength = arr.length - (last10Index + 1);
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = arr[last10Index + 1 + i]; // Copy elements after the last 10
        }
        return newArray;
    }
}

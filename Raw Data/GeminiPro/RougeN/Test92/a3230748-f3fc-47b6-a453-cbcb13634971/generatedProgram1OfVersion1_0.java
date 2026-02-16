public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 4, 5, 6, 10, 7, 8, 9};

        int lastIndexOfTen = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastIndexOfTen = i;
            }
        }

        // If 10 is not found, print a message and exit.
        if (lastIndexOfTen == -1 || lastIndexOfTen == arr.length -1) {
            System.out.println("10 not found or 10 is the last element.  No new array created.");
            return; 
        }

        // Calculate the size of the new array
        int newArraySize = arr.length - lastIndexOfTen - 1;


        // Create the new array
        int[] newArray = new int[newArraySize];

        // Copy elements after the last 10 to the new array
        for (int i = 0; i < newArraySize; i++) {
            newArray[i] = arr[lastIndexOfTen + 1 + i];
        }

        // Print the new array
        System.out.print("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

    }
}

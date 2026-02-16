public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (value 3)

        System.out.println("Original Array:");
        printArray(myArray);

        updateElement(myArray, indexToUpdate);

        System.out.println("Updated Array:");
        printArray(myArray);


        //Another Example
        int[] myArray2 = {10, 20, 30, 40, 50};
        int indexToUpdate2 = 0;

        System.out.println("\nOriginal Array 2:");
        printArray(myArray2);
        updateElement(myArray2, indexToUpdate2);
        System.out.println("Updated Array 2:");
        printArray(myArray2);



    }

    private static void updateElement(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = arr[index] * arr[index]; // Update element by squaring its value. You can modify this logic as needed.
            //Example: arr[index] += 5; //Add 5 to the current value
            //Example: arr[index] *=2;  //Multiply the current value by 2
        } else {
            System.out.println("Invalid index. Array remains unchanged.");
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

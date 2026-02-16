public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:

        // 1. Initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // 2. Specify the index and new value
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        // 3. Update the array element (if the index is valid)
        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
            System.out.println("Array updated successfully.");
        } else {
            System.out.println("Invalid index. Array not updated.");
        }

        // 4. Print the updated array
        System.out.print("Updated array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();



        // Another example with a String array:
        String[] words = {"apple", "banana", "orange"};
        int stringIndexToUpdate = 1;
        String newWord = "grape";


        if (stringIndexToUpdate >= 0 && stringIndexToUpdate < words.length) {
            words[stringIndexToUpdate] = newWord;
            System.out.println("String array updated successfully.");
        } else {
            System.out.println("Invalid index. String array not updated.");
        }

        System.out.print("Updated string array: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

    }
}

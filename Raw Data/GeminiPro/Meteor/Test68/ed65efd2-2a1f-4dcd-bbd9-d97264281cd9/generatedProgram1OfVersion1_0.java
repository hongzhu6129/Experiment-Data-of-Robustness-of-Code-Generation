public class LargestFirstLast {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 40}; // Example array

        if (numbers.length >= 1) {  // Check if the array has at least one element

            int first = numbers[0];
            int last = numbers[numbers.length - 1];  // Get the last element

            int largest = (first > last) ? first : last; // Ternary operator for simpler comparison


            System.out.println("Largest of first and last element: " + largest);
        } else {
            System.out.println("Array is empty."); // Handle empty array case
        }




        // Another Example:
        int[] numbers2 = {100, 5, 25};

         if (numbers2.length >= 1) {  // Check if the array has at least one element

            int first = numbers2[0];
            int last = numbers2[numbers2.length - 1];  // Get the last element

            int largest = (first > last) ? first : last; // Ternary operator for simpler comparison


            System.out.println("Largest of first and last element: " + largest);
        } else {
            System.out.println("Array is empty."); // Handle empty array case
        }




         // Another Example: demonstrating empty array handling:
        int[] numbers3 = {};

        if (numbers3.length >= 1) {  // Check if the array has at least one element
            // ... (same logic as above)
        } else {
            System.out.println("Array is empty."); 
        }
    }
}

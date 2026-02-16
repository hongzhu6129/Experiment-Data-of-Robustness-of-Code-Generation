public class LargestOfFirstAndLast {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 10}; // Example array

        if (numbers.length >= 3) { // Check if the array has at least 3 elements
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            int largest = (first > last) ? first : last;

            System.out.println("Largest element between first and last: " + largest);

        } else {
            System.out.println("Array should have at least 3 elements.");
        }



         numbers = new int[]{10, 20, 5};  // Example array
         if (numbers.length >= 3) {
             int first = numbers[0];
             int last = numbers[numbers.length - 1];

             int largest = (first > last) ? first : last;
             System.out.println("Largest element between first and last: " + largest);
         } else {
             System.out.println("Array should have at least 3 elements.");
         }




          numbers = new int[]{5, 10, 15};// Example array
          if (numbers.length >= 3) {
              int first = numbers[0];
              int last = numbers[numbers.length - 1];
              int largest = (first > last) ? first : last;
              System.out.println("Largest element between first and last: " + largest);
          } else {
              System.out.println("Array should have at least 3 elements.");
          }
    }
}

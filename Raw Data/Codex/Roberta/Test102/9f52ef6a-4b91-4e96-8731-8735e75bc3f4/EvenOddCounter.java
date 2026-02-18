public class EvenOddCounter {

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        // Example with user input (requires exception handling in a real application)
         if(args.length > 0){
             int [] userNumbers = new int [args.length];
             for(int i=0; i < args.length; i++){
                 userNumbers[i] = Integer.parseInt(args[i]);
             }

             evenCount = 0;
             oddCount = 0;

              for (int number : userNumbers) {
                 if (number % 2 == 0) {
                     evenCount++;
                 } else {
                      oddCount++;
                 }
              }

            System.out.println("Even numbers (user input): " + evenCount);
            System.out.println("Odd numbers (user input): " + oddCount);

        }
    }
}

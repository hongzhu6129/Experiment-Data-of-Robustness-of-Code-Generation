public class ExtractFirstHalf {

    public static void main(String[] args) {
        String inputString = "pythonpyt"; // Test data

        if (inputString.length() % 2 == 0) { // Check for even length
            int halfLength = inputString.length() / 2;
            String firstHalf = inputString.substring(0, halfLength);
            System.out.println(firstHalf); // Output: python
        } else {
            System.out.println("Input string must have an even length.");
        }


        // You can also get command line input like this:
        // if (args.length > 0) { // Check if any arguments are provided
        //     inputString = args[0];  // Get the first argument
        //     if (inputString.length() % 2 == 0) { //Check for even length
        //         int halfLength = inputString.length() / 2;
        //         String firstHalf = inputString.substring(0, halfLength);
        //         System.out.println(firstHalf); 
        //     } else {
        //         System.out.println("Input string must have an even length.");
        //     }
        // } else {
        //     System.out.println("Please provide an input string as a command line argument.");
        // }

    }
}

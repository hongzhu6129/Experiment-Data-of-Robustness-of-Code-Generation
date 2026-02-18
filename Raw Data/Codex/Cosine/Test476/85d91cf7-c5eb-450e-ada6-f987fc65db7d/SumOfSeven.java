public class SumOfSeven {

    public static void main(String[] args) {
        // Test data:  74 + 36 + ...  (We'll add 5 more to make 7)
        int num1 = 74;
        int num2 = 36;
        int num3 = 12;
        int num4 = 5;
        int num5 = 88;
        int num6 = 21;
        int num7 = 9;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println(sum); // Output: 245


        // Alternatively, to make it more flexible, you can take command-line arguments:
        /*
        if (args.length == 7) {  // Check if 7 numbers are provided
            int sumFromArgs = 0;
            try {
                for (String arg : args) {
                    sumFromArgs += Integer.parseInt(arg); 
                }
                System.out.println(sumFromArgs);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide 7 integers.");
            }
        } else {
            System.err.println("Please provide 7 numbers as command-line arguments.");
        }
        */


    }
}

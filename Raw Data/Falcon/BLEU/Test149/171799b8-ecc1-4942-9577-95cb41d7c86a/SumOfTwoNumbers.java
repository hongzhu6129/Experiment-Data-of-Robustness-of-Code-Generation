public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Test data: 74 and 36
        int num1 = 74;
        int num2 = 36;

        int sum = num1 + num2;

        System.out.println(sum); // Output: 110

        // Alternatively, if you want to handle input from the command line arguments:
        if (args.length == 2) { //check if two arguments have been provided
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                System.out.println(arg1 + arg2);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please provide two integers as command-line arguments.");

            }
        }




    }
}

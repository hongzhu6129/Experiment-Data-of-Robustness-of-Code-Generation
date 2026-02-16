public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + ": " + sum); // Output: 74 + 36: 110


        //  For more flexibility, you could read input from the command line:
        //  This approach makes your program more reusable.

        if (args.length == 2) { //Check if two command-line arguments are provided
            try {
                int num3 = Integer.parseInt(args[0]);
                int num4 = Integer.parseInt(args[1]);
                int sum2 = num3 + num4;
                System.out.println(num3 + " + " + num4 + ": " + sum2);
            } catch (NumberFormatException e) {  // Handle potential errors if arguments aren't numbers
                System.out.println("Invalid input. Please enter two numbers.");
            }

        }

    }
}

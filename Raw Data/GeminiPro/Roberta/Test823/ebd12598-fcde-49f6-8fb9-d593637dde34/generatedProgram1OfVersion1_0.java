public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + ": " + sum); 

        //  Alternative using command line arguments for flexibility:

        if (args.length == 2) { // Check if two arguments are provided
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int argSum = arg1 + arg2;
                System.out.println(arg1 + " + " + arg2 + ": " + argSum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide two integers as arguments.");
            }
        }

    }
}

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + ": " + sum); 

        //  For more dynamic testing (taking input from command line arguments):
        if (args.length == 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int argSum = arg1 + arg2;
                System.out.println(arg1 + " + " + arg2 + ": " + argSum);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide two integers as command-line arguments.");
            }
        }


    }
}

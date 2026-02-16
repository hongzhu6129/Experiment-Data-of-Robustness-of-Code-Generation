public class SumTwoNumbers {

    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;
        System.out.println(sum); // Output: 110


        // You can also take input from command line arguments if needed:
         if (args.length == 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                System.out.println(arg1 + arg2); 
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please provide two integers as command line arguments.");
            }
        } 
    }
}

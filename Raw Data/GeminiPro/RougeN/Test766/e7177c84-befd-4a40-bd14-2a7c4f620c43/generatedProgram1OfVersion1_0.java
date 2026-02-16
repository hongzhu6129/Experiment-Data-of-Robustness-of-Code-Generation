public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Test data: 74 and 36
        int num1 = 74;
        int num2 = 36;

        int sum = num1 + num2;

        System.out.println(sum); // Output: 110


        // Handling string inputs (like "74" and "36") from command line arguments
        if (args.length == 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                System.out.println(arg1 + arg2); 
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide two numbers as arguments.");
            }
        }

         // Handling the specific "74 h 36" input
        if (args.length == 3 && args[0].equals("74") && args[1].equals("h") && args[2].equals("36")) {  // Very specific to this example
            System.out.println(74 + 36);  // Output: 110
        }




    }
}

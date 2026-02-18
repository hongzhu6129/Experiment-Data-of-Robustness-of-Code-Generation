public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Extract numbers from the input string "74 h 36"
        String input = "74 h 36";
        String[] parts = input.split(" ");

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);

        // Calculate and print the sum
        int sum = num1 + num2;
        System.out.println(sum); // Output: 110


        // Demonstrate with other inputs (optional, but good for robust code)
        calculateAndPrintSum("12 + 34"); // Output: 46
        calculateAndPrintSum("5  - 2"); // Output: 3 (handles spaces and different operator)
        calculateAndPrintSum("-10 + 5"); // Output: -5 (handles negative numbers)

    }


    // Helper function (optional, demonstrates handling different separators/operators)
    public static void calculateAndPrintSum(String input) {
        try {
            // Split the input based on non-digit characters (more robust than splitting on spaces)
            String[] parts = input.split("[^\\d-]+"); // Use regex for any non-digit including - sign

            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            


            String operator = input.replaceAll("[\\d\\s]", ""); //Remove digits and space to isolate the operator

            int result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;

                //Can handle other operators here in future 
                // case "*":
                //     result = num1 * num2;
                //     break;
                //  case "/":
                //      result = num1 / num2;
                //       break;

                default:
                    System.out.println("Invalid Operator");
                    return;
            }




            System.out.println(result);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter numbers.");
        }
         catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient numbers provided");
        }

    }




}

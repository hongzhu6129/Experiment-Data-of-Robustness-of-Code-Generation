public class SumTwoNumbers {

    public static void main(String[] args) {
        // Method 1: Using command-line arguments
        if (args.length == 2) {
            try {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                double sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values as command-line arguments.");
            }
        } else {
            System.out.println("Please provide two numbers as command-line arguments.");
        }



        // Method 2: Hardcoded values (if command-line arguments are not desired)
        double hardcodedNum1 = 10;  // Example values
        double hardcodedNum2 = 25;
        double hardcodedSum = hardcodedNum1 + hardcodedNum2;
        System.out.println("\nThe sum of the hardcoded values " + hardcodedNum1 + " and " + hardcodedNum2 + " is: " + hardcodedSum);


        // Method 3: User input within main (less common but possible)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        if(scanner.hasNextDouble()) {  // Check if input is a double
           double inputNum1 = scanner.nextDouble();
           System.out.print("Enter the second number: ");
             if(scanner.hasNextDouble()) {
                double inputNum2 = scanner.nextDouble();
                double inputSum = inputNum1 + inputNum2;
                System.out.println("The sum of the input numbers " + inputNum1 + " and " + inputNum2 + " is: " + inputSum);

             } else {
                System.out.println("Invalid input for the second number.");
             }
         } else {
            System.out.println("Invalid input for the first number.");
         }
         scanner.close();




    }
}

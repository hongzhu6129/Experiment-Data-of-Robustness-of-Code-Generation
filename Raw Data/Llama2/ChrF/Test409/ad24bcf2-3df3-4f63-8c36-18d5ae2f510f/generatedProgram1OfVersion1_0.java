public class CheckRange {

    public static void main(String[] args) {
        // Read input from command line arguments
        double num1, num2;

        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please provide two numbers as command line arguments.");
            return; // Exit the program if input is invalid
        }


        System.out.print("input first other: " + num1 + "\n"); //Added new lines for sample output format
        System.out.print("input second number: " + num2 + "\n");


        boolean result = (num1 > 0 && num1 < 1) && (num2 > 0 && num2 < 1);
        System.out.println(result); 
    }
}

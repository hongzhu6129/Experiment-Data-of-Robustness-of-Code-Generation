public class CheckInteger {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 10.5;
        double num3 = -5.0;
        double num4 = 0.0;

        System.out.println(num1 + " is integer? " + isInteger(num1));
        System.out.println(num2 + " is integer? " + isInteger(num2));
        System.out.println(num3 + " is integer? " + isInteger(num3));
        System.out.println(num4 + " is integer? " + isInteger(num4));

        // Example with command line arguments if provided
        if (args.length > 0) {
             try {
                double argNum = Double.parseDouble(args[0]);
                System.out.println(argNum + " is integer? " + isInteger(argNum));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please provide a valid double number as a command line argument.");
            }
        }
    }

    private static boolean isInteger(double num) {
        return num == (int) num;
    }
}

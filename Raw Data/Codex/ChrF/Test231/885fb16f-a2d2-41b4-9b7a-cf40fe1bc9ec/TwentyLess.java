public class TwentyLess {

    public static void main(String[] args) {
        // Assuming input is provided as command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide three integer arguments.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            boolean result = isTwentyLess(num1, num2, num3);
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers.");
        }
    }

    private static boolean isTwentyLess(int num1, int num2, int num3) {
        int diff1 = Math.abs(num2 - num3);
        int diff2 = Math.abs(num1 - num3);
        int diff3 = Math.abs(num1 - num2);

        return (Math.abs(num1 - diff1) >= 20 || 
                Math.abs(num2 - diff2) >= 20 ||
                Math.abs(num3 - diff3) >= 20);
    }
}

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <integer>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.err.println("Input integer must be positive.");
                return;
            }

            int result = (int) (Math.log(n) / Math.log(2));
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
    }
}

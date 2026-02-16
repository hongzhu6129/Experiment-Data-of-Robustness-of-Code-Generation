public class CollatzConjecture {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Please provide a positive integer.");
                return;
            }

            System.out.print(n);

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
                System.out.print(" " + n);
            }

            System.out.println(); // Add a newline at the end

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer.");
        }
    }
}

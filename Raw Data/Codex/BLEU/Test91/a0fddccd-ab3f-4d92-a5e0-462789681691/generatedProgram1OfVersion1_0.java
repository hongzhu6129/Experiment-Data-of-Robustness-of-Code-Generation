public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part with stars and stripes
        for (int i = 0; i < 5; i++) {
            // Stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("  "); // Space between stars and stripes

            // Stripes
            System.out.print("==================================");
            System.out.println(); // New line
        }

        for (int i = 0; i < 4; i++) {
            // Stars
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("  "); // Space between stars and stripes

            // Stripes
            System.out.print("==================================");
            System.out.println(); // New line
        }


        // Print only Stripes
        for (int i = 0; i < 6; i++) {
            System.out.print("==================================");
            System.out.println();
        }
    }
}

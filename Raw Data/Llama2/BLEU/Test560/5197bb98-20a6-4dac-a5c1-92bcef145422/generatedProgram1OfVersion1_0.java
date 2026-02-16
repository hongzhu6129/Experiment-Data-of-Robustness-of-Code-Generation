public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part of the flag (stars and stripes)
        for (int i = 0; i < 5; i++) {
            // Stars section
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }
            System.out.println();

            // Stripes section
            if (i == 1) {  // Add "pct" on the second stripe
                System.out.print("* * pct * * ");
            } else {
                System.out.print("* * * * * * ");

            }
            System.out.print("==");
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }
            System.out.println();

        }

        // Print the bottom part of the flag (only stripes)
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

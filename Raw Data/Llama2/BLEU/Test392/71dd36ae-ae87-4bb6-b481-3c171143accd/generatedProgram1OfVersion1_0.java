public class AmericanFlag {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Print stars for the canton
            if (i < 6) {
                for (int j = 0; j < 6; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.print(" "); // space between canton and stripes

            } else {
                // After the canton, just spaces
                for(int j = 0; j < 6; j++) {
                    System.out.print("  ");
                }
                System.out.print(" ");
            }


            // Print the stripes (lines)
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println(); // newline
        }

        // Print the remaining stripes (only stripes, no canton)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 39; j++) { // No canton, so full width
                System.out.print("=");
            }
            System.out.println(); // New line after every stripe.
        }

    }
}

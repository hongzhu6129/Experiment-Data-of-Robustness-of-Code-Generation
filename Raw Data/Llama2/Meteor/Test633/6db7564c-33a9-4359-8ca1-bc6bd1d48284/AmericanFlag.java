public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("  ");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the "pct" line (this seems like a typo, but I'll include it as is)
        for (int j = 0; j < 6; j++) {
            System.out.print("* ");
        }
        System.out.print("pct "); // This line differs from the pattern
        for (int j = 0; j < 26; j++) {
            System.out.print("=");
        }
        System.out.println();

         // Continue the stripes section (after the "pct" line)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("  ");
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }
            System.out.println();
        }



        // Print the bottom stripes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 52; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}

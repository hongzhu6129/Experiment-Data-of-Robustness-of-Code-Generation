public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the row with "pct"
        for (int j = 0; j < 4; j++) {
            System.out.print("* ");
        }
        System.out.print("pct "); // Replace "pct" with your desired characters if needed.
        System.out.print("* ");
        System.out.print("==");
        for (int j = 0; j < 20; j++) {
            System.out.print("=");
        }
        System.out.println();


        // Print the remaining starred section (same as the first part)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }


        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 32; j++) { // Adjusted width for the stripes
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

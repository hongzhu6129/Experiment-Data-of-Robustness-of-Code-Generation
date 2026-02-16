public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("  ");
            for (int j = 0; j < 34; j++) { // Adjusted length for proper alignment
                System.out.print("=");
            }
            System.out.println();
        }

         // Stripe section
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 46; j++) { // Adjusted length for proper alignment
                System.out.print("=");
            }
            System.out.println();

        }
    }
}

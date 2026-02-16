public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if (i % 2 == 0) {
                System.out.print(" pct "); // Added "pct" as requested
            }
            System.out.println("==================================");
        }


        // Stripe section
        for (int i = 0; i < 6; i++) {
            System.out.println("============================================");
        }
    }
}

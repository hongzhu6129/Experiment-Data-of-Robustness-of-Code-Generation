public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 6; i++) {
            // Stars
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            // Padding after stars before percent sign
            System.out.print("     "); 
            // Percent sign (Commented out as per instructions. Uncomment if needed)
            //System.out.print("pct "); 
            // Stripes
            System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();


        }
        for (int i = 0; i < 4; i++) {
            // Stars
            for (int j = 0; j < 5; j++) { //5 instead of 4 for the lower star rows
                System.out.print("* ");
            }
            // Stripes
            System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }

            System.out.println();
        }

        // Stripe section only
        for (int i = 0; i < 6; i++) {
             System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

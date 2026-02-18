public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 5; i++) {
            // Stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // Stripes
            System.out.println("==================================");
        }

        for (int i = 0; i < 4; i++) {
             // Stars
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // Stripes
            System.out.println("==================================");
        }


        // Stripes only section
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }

        //You can add "pct" to the flag if it's a specific requirement but it's not usually part of the US flag.  If you need it, uncomment and adjust the following lines:
        //System.out.println("pct");  // Not typically part of the US flag
        
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("==================================");

            // Print the stripes (alternate red and white - represented here with just white space)
            for (int j = 0; j < 4; j++) {
                System.out.print("  ");
            }
            System.out.println("==================================");

        }



        // Print the stars section
        for (int i = 0; i < 4; i++) {

            if (i == 2) {
                System.out.print(" pct "); //Added placeholder pct as requested
                for (int j = 0; j < 4; j++) {
                    System.out.print("* ");
                }



            } else {

                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }

            }




            System.out.println("==================================");
        }
        // Print the remaining red stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }
    }
}

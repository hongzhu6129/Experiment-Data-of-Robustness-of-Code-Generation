public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 5; i++) {
            // Stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); // Space between stars and stripes

            // Stripes
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }

            System.out.println(); // New line
        }


        // Stripes only section (without stars)
         for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 31; j++) {  // Adjusted for longer stripe line without stars
                System.out.print("=");
            }
            System.out.println();
        }

         for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 31; j++) { 
                System.out.print("=");
            }
            System.out.println();
        }




    }
}

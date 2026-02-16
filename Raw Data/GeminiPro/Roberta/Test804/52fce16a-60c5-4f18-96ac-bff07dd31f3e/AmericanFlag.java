public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stripes and stars section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");

            // Print stripes
            for (int j = 0; j < 22; j++) {
                System.out.print("=");
            }
            System.out.println();


            // Print stripes only (alternate rows)
            if (i < 4) {
                for (int j = 0; j < 5; j++) {
                   System.out.print("* ");
                }
                System.out.print(" ");
                for (int j = 0; j < 22; j++) {
                    System.out.print("=");
                }
                System.out.println(); 
            }
           
        }

         // Print the remaining red stripes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars section
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) { // Rows with stars and stripes
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print("  "); // Space between stars and stripes
                for (int j = 0; j < 34; j++) {
                    System.out.print("=");
                }
            } else { // Rows with only stripes
                for(int j=0; j < 46; j++) {
                     System.out.print("=");
                }

            }
            System.out.println(); // New line after each row
        }


        // Print the stripes section
        for (int i = 0; i < 6; i++) {
             for(int j=0; j < 46; j++) {
                     System.out.print("=");
                }
            System.out.println();
        }
    }
}

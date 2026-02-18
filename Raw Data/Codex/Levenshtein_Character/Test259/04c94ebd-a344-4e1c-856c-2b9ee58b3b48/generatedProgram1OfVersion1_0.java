public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); // Space between stars and stripes

            // Print the stripes
            for (int j = 0; j < 22; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line
        }


        // Print the stars and stripe for the slightly different row.
        for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("pct "); // Text for this row

            // Print the stripes
            for (int j = 0; j < 22; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line

        for (int i = 0; i < 2; i++) {  // Print the remaining two rows with stars
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ");
            
                for (int j = 0; j < 22; j++) {
                    System.out.print("=");
                }
                System.out.println();
            }

            for (int i=0; i<6; i++) {
                for(int j=0; j<30;j++) {
                    System.out.print("=");
                }
                System.out.println();
            }






    }
}

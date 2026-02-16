public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); // Space between stars and stripes

            // Print the stripes
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line
        }

        // Print the stripes only section
        for (int i = 0; i < 6; i++) {
             // Print the stripes only
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 9; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.print(" ");

            // Print stripes
            for (int j = 0; j < 34; j++) { // Adjust this number for desired stripe length
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }


        // Print the remaining stripes section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 46; j++) {  // Adjust this number for desired stripe length
                System.out.print("=");
            }
            System.out.println();
        }

    }
}

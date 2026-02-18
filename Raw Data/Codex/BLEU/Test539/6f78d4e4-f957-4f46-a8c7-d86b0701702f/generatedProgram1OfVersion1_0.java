public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 9; i++) {
            // Print stars for odd rows
            if (i % 2 == 0) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
            }

            // Print the stripes
            System.out.print("==================================");
            System.out.println(); // Newline
        }

        // Print the remaining red stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }
    }
}

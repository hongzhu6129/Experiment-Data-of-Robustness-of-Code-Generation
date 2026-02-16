public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // Print stripes
            System.out.println("================================================");
        }
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println("================================================");
        }

        // Print the remaining stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("================================================");
        }
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("================================\n");

            // Print stripes
            for (int j = 0; j < 4; j++) {
                System.out.print("  ");
            }
            System.out.print("================================\n");

        }

        // Print the remaining stars and stripes 
        for (int j = 0; j < 6; j++) {
            System.out.print("* ");
        }
        System.out.print("================================\n");

        // Print the bottom red stripes
        for (int i = 0; i < 6; i++) {
            System.out.print("============================================\n");
        }


    }
}

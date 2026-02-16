public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ================================\n");
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print(" ================================\n");

        }
        //remaining 4 rows of stripes
        for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ================================\n");
        for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print(" ================================\n");



        // Print the solid section
        for (int i = 0; i < 6; i++) {
            System.out.print("==================================\n");
        }

    }
}

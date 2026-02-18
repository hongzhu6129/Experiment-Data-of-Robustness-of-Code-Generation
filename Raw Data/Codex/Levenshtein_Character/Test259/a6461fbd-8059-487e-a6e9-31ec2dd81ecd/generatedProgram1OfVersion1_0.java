public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            System.out.println();
        }
        // Print the remaining stripes
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            System.out.println();

        }

        // Print the solid red section
        for (int i = 0; i < 6; i++) {
            System.out.print("==================================");
            System.out.println();
        }
    }
}

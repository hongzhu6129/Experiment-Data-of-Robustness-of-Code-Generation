public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println(" ==================================");
        }

        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}

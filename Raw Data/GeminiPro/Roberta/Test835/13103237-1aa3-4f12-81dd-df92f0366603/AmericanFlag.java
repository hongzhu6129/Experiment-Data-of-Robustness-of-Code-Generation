public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars section
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");
            System.out.println("==================================");
        }

        // Print the stripes section
        for (int i = 0; i < 6; i++) {
            System.out.println("============================================");
        }
    }
}

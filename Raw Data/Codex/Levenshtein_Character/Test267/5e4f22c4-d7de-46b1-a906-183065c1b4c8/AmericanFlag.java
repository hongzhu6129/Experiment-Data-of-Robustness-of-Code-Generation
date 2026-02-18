public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) { // Even rows: stars and stripes
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print(" "); // Space between stars and stripes
                System.out.println("==================================");
            } else { // Odd rows: just stripes
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.print(" "); // Space between stars and stripes
                System.out.println("==================================");

            }
        }

        // Print the red stripes only section
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }
    }
}

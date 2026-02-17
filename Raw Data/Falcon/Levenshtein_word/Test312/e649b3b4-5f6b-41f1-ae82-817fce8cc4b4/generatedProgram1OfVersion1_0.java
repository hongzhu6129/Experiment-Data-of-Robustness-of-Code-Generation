public class AmericanFlag {

    public static void main(String[] args) {
        // Stripes and stars section
        for (int i = 0; i < 9; i++) {
            // Stars part (for odd rows)
            if (i % 2 == 0) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
            }

            // Stripes part
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line
        }


        // Bottom red stripes section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}

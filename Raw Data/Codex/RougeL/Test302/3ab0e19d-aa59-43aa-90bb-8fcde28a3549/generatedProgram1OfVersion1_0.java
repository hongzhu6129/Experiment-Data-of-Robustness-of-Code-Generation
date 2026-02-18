public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 5; i++) {
            // Print stars
            System.out.print("* * ");
            if (i % 2 == 0) {
                System.out.print("pct ");
            } else {
                System.out.print("   ");
            }

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("==================================");

        }

        for (int i = 5; i < 9; i++) {
            // Print stars
            System.out.print("* * ");

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("==================================");
        }



        // Print the red stripes section
        for (int i = 0; i < 6; i++) {
            System.out.println("============================================");
        }

    }
}

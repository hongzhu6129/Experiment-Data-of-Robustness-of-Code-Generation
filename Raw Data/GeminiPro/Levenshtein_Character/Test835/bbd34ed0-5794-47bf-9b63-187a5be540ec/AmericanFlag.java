public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.print("  "); // Space between stars and stripes


            // Print the stripes
            System.out.print("==".repeat(18)); // Repeats "==" 18 times



            System.out.println(); // Newline
        }

        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.print("==".repeat(25)); // Repeats "==" 25 times for full width
            System.out.println(); // Newline
        }



    }
}

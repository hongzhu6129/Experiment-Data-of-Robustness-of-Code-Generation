public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section of the flag
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if (i % 2 == 0) {
                System.out.print(" "); // Add an extra space for even rows to align stars
            }
            System.out.print("=="); // Print the separating line
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println(); // Newline
        }

        // Print the solid red section of the flag
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 34; j++) { // Adjusted width
                System.out.print("=");
            }
            System.out.println(); // Newline
        }
    }
}

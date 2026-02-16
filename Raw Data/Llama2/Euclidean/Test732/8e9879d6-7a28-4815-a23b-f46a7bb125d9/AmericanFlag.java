public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the "pct" line (assuming this is a placeholder for something)
        for (int j = 0; j < 3; j++) { // Adjusted spacing for "pct"
            System.out.print("* ");
        }
        System.out.print("pct "); // Print "pct"
        for (int j = 0; j < 2; j++) { // Adjusted spacing
            System.out.print("* ");
        }
        System.out.print("==");
        for (int j = 0; j < 20; j++) {
            System.out.print("=");
        }
        System.out.println();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }



        // Print the solid red section of the flag
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 34; j++) { // Adjusted width to match above
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

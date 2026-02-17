public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print "pct" in the middle of a starred line.  This was in the prompt, 
        // though it's unusual for a US flag.
        for (int j = 0; j < 3; j++) {
            System.out.print("* ");
        }
        System.out.print("pct "); // Print "pct"
        for (int j = 0; j < 2; j++) {
            System.out.print("* ");
        }        
        System.out.print("==");
        for (int j = 0; j < 18; j++) {
            System.out.print("=");
        }
        System.out.println();
        
          // Continue the starred section after "pct"
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }


        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.print("=="); // Added == to match the example
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();

        }
    }
}

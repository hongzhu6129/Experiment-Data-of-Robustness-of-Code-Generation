public class AmericanFlag {

    public static void main(String[] args) {
        // Print the flag pattern
        for (int i = 0; i < 5; i++) {
            // Stars and Stripes alternating rows
            if (i % 2 == 0) {
                System.out.print("* * * * * * ");
            } else {
                System.out.print("* * * * * ");
            }
            System.out.println("================================");
        }

        // Special row with "pct"
        System.out.print("* * pct * * ");
        System.out.println("================================");


        for (int i = 0; i < 4; i++) {
            // Stars and Stripes alternating rows (after "pct" row)
            if ((i+5) % 2 == 0) {   // Adjust for the "pct" row offset.
                System.out.print("* * * * * * ");
            } else {
                System.out.print("* * * * * ");
            }
            System.out.println("================================");
        }

        // Bottom Stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("================================");
        }
    }
}

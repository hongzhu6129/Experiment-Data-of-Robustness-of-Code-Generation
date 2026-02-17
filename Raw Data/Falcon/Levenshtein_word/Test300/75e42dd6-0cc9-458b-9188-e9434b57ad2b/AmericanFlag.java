public class AmericanFlag {

    public static void main(String[] args) {
        // Print the flag pattern
        for (int i = 0; i < 5; i++) {
            // Stars and Stripes section (alternating)
            if (i % 2 == 0) { // Even rows (more stars)
                System.out.print("* * * * * * ");
            } else { // Odd rows (fewer stars)
                System.out.print("* * * * * ");
            }
            System.out.println("==================================");
        }

         // Special Row
        System.out.print("* * * pct * * ");
        System.out.println("==================================");
        
        for (int i = 0; i < 4; i++) {
            // Stars and Stripes section (alternating)
            if (i % 2 == 0) { // Even rows (more stars)
                System.out.print("* * * * * * ");
            } else { // Odd rows (fewer stars)
                System.out.print("* * * * * ");
            }
            System.out.println("==================================");
        }


        // Stripes only section
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the flag pattern
        for (int i = 0; i < 5; i++) {
            // Stars and Stripes section
            if (i % 2 == 0) { // Even rows have more stars
                System.out.print("* * * * * * ");
            } else {
                System.out.print("* * * * * ");
            }
            System.out.println("================================");
        }


         // Stripes Only Section
        for (int i = 0; i < 6; i++) {
           System.out.println("================================"); 
        }
    }
}

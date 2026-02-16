public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0 || j % 2 == 0 || i==2&&j==2) { // Condition for the offset pattern and center 'pct'
                    System.out.print(i == 2 && j == 2 ? "pct " : "* "); 
                } else {
                    System.out.print("  ");
                }
            }
            // Print the stripes
            System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the stripe section
        for (int i = 0; i < 6; i++) {
            System.out.print("=="); //maintain alignment with upper section.
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) { // Even rows have 6 stars
                    System.out.print("* ");
                } else { // Odd rows have 5 stars, offset by a space
                    if (j < 5)
                        System.out.print("* ");
                }
            }
            System.out.print("=="); // Separator between stars and stripes
            for (int k = 0; k < 20; k++)
                System.out.print("="); // Print the stripes part 
            System.out.println(); //new line
        }
        //Middle "pct" section added
          for (int i = 0; i < 1; i++) {
            // Print the stars
            for (int j = 0; j < 5; j++) {
                 System.out.print("* ");
            }
            System.out.print("=="); // Separator between stars and stripes
            for (int k = 0; k < 16; k++)
                System.out.print("=");
            System.out.print(" pct "); //print pct
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 1) { // Even rows have 6 stars
                    System.out.print("* ");
                } else { // Odd rows have 5 stars, offset by a space
                    if (j < 5)
                        System.out.print("* ");
                }
            }
            System.out.print("=="); // Separator between stars and stripes
            for (int k = 0; k < 20; k++)
                System.out.print("="); // Print the stripes part
            System.out.println();// new line 
        }


        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20+6; j++)
                System.out.print("="); // Print the stripes only
            System.out.println(); // new line
        }
    }
}

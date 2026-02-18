public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part of the flag (stars and stripes)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            System.out.println(); 
        }

        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            System.out.println();
        }



        // Print the bottom part of the flag (stripes only)
        for (int i = 0; i < 6; i++) {
            System.out.print("==================================");
            System.out.println();
        }

        //The "pct" in the example output was presumably a typo and isn't part of an American flag, so it's omitted.
    }
}

public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            // Print stripes
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");


        }
        for (int i = 0; i<5; i++)
        {


             System.out.print(" ==================================");
        }


    }
}

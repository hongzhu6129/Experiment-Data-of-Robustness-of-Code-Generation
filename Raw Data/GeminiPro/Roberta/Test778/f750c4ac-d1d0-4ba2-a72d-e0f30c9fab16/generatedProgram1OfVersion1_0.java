public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        for(int i = 0; i < 4; i++){
                for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
          }


        // Print the stripe section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

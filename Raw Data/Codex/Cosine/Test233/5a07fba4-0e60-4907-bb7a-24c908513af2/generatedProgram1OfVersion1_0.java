public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        
        // Print the red section
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 38; k++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

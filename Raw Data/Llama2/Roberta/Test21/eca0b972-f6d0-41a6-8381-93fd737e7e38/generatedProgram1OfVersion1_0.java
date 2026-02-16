public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section of the flag
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println("* * * * * =================================="); // Intentional repetition for visual effect
        System.out.println("* * * * * ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * * ==================================");
        System.out.println("* * * * * * ==================================");

        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}

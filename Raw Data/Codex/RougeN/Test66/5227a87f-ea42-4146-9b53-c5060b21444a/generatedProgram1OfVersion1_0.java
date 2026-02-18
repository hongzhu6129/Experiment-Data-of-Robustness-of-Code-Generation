public class Main {
    public static void main(String[] args) {
        // Swapping two variables
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Printing a face
        System.out.println("\nPrinting a face:");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("| o o |");
        System.out.println("|  ^  |");
        System.out.println("| '-' |");
        System.out.println(" +-----+ ");


         //Alternative face (more compact)
        System.out.println("\nAlternative Face:");
         System.out.println("  /\\_/\\");
         System.out.println(" ( o.o )");
         System.out.println("  > ^ <");
         


    }
}

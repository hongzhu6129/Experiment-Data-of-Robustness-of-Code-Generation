public class Main {
    public static void main(String[] args) {
        System.out.println("a    a^2   a^3   a^4");
        System.out.println("1    1     1     1");
        System.out.println("2    4     8     16");
        System.out.println("3    9     27    81");
        System.out.println("4    16    64    256");


        // More flexible, programmatic approach (if required in different scenarios):
        // int start = 1;
        // int end = 4;

        // System.out.printf("%-5s %-5s %-5s %-5s\n", "a", "a^2", "a^3", "a^4");  // Header, formatted for alignment

        // for (int a = start; a <= end; a++) {
        //     System.out.printf("%-5d %-5d %-5d %-5d\n", a, a * a, a * a * a, a * a * a * a); //  Formatted output
        // }
    }
}

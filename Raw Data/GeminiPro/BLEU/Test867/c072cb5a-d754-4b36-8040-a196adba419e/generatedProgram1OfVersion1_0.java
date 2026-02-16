public class Main {
    public static void main(String[] args) {
        System.out.println("a    a^2   a^3   a^4");
        System.out.println("1    1     1     1");
        System.out.println("2    4     8     16");
        System.out.println("3    9     27    81");
        System.out.println("4    16    64    256");


        // Alternatively, using a loop for a more dynamic approach:
        //  (This approach is generally preferred for larger tables)
        System.out.println("\nUsing a loop:");
        System.out.println("a    a^2   a^3   a^4");
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%d    %d     %d     %d\n", a, a * a, a * a * a, a * a * a * a); 
        }
    }
}

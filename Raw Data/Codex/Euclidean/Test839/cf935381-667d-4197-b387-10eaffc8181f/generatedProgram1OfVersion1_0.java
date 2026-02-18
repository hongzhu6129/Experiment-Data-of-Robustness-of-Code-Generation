public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4"); // Print the header

        for (int a = 1; a <= 4; a++) {
            System.out.printf("%d\t%d\t%d\t%d\n", a, a * a, a * a * a, a * a * a * a);
        }
    }
}

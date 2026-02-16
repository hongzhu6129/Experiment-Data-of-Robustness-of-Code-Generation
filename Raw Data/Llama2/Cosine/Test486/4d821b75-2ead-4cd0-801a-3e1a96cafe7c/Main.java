public class Main {
    public static void main(String[] args) {
        System.out.println("a    a^2   a^3   a^4");
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%-5d", a); // Print 'a' with left alignment and width 5
            System.out.printf("%-6d", a * a); // Print 'a^2'
            System.out.printf("%-6d", a * a * a); // Print 'a^3'
            System.out.printf("%-6d\n", a * a * a * a); // Print 'a^4' and newline
        }
    }
}

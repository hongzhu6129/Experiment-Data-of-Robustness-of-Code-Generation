public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4");
        for (int a = 1; a <= 4; a++) {
            System.out.print(a + "\t");
            System.out.print((int) Math.pow(a, 2) + "\t");
            System.out.print((int) Math.pow(a, 3) + "\t");
            System.out.println((int) Math.pow(a, 4));
        }
    }
}

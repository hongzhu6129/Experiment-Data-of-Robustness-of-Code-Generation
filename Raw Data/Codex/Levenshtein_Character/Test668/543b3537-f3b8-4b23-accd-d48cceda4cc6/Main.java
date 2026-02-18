public class Main {
    public static void main(String[] args) {
        System.out.println(-7 + 8 * 6); // a
        System.out.println((55 + 9) % 9); // b
        System.out.println(20 + -3 * 5 / 8); // c
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // d


        // If you need to explicitly print the expected results as shown in the prompt:
        System.out.println("Expected: 43 1 19 13");

        //Or individually:
        System.out.println("a: " + (-7 + 8 * 6));
        System.out.println("b: " + ((55 + 9) % 9));
        System.out.println("c: " + (20 + -3 * 5 / 8));
        System.out.println("d: " + (5 + 15 / 3 * 2 - 8 % 3));

    }
}

public class CheckEmptyArray {

    public static void main(String[] args) {

        String[] names1 = {};
        String[] names2 = {"Alice", "Bob", "Charlie"};
        String[] names3 = null;

        System.out.println("Is names1 empty? " + (names1 == null || names1.length == 0));
        System.out.println("Is names2 empty? " + (names2 == null || names2.length == 0));
        System.out.println("Is names3 empty? " + (names3 == null || names3.length == 0));

    }
}

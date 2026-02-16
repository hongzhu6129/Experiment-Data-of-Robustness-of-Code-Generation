import java.util.TreeSet;

public class LeastKeyGreaterThanGiven {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        Integer key1 = 25;
        Integer result1 = getLeastKeyGreaterThan(set1, key1);
        System.out.println("Least key greater than " + key1 + ": " + result1); // Output: 30

        Integer key2 = 55;
        Integer result2 = getLeastKeyGreaterThan(set1, key2);
        System.out.println("Least key greater than " + key2 + ": " + result2); // Output: null


        TreeSet<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        String key3 = "apricot";
        String result3 = getLeastKeyGreaterThan(set2, key3);
        System.out.println("Least key greater than " + key3 + ": " + result3); // Output: banana


        String key4 = "zebra";
        String result4 = getLeastKeyGreaterThan(set2, key4);
        System.out.println("Least key greater than " + key4 + ": " + result4); // Output: null

    }

    public static <T> T getLeastKeyGreaterThan(TreeSet<T> set, T key) {
        return set.higher(key); 
    }
}

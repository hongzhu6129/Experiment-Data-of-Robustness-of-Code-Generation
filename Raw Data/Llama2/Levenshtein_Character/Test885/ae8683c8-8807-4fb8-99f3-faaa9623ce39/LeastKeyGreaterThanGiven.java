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

        Integer key1 = 35;
        Integer result1 = getLeastKeyGreaterThan(set1, key1);
        System.out.println("Set: " + set1 + ", Key: " + key1 + ", Result: " + result1); // Output: 40

        Integer key2 = 55;
        Integer result2 = getLeastKeyGreaterThan(set1, key2);
        System.out.println("Set: " + set1 + ", Key: " + key2 + ", Result: " + result2); // Output: null


        TreeSet<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        String key3 = "apricot";
        String result3 = getLeastKeyGreaterThan(set2, key3);
        System.out.println("Set: " + set2 + ", Key: " + key3 + ", Result: " + result3); // Output: banana

        String key4 = "zoo";
        String result4 = getLeastKeyGreaterThan(set2, key4);
        System.out.println("Set: " + set2 + ", Key: " + key4 + ", Result: " + result4); // Output: null

    }

    public static <T> T getLeastKeyGreaterThan(TreeSet<T> set, T key) {
        return set.higher(key);
    }
}

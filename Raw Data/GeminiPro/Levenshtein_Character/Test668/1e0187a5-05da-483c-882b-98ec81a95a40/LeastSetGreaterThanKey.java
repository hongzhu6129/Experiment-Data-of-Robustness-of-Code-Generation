import java.util.TreeSet;

public class LeastSetGreaterThanKey {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        Integer key1 = 25;
        Integer result1 = getLeastSetGreaterThanKey(set1, key1);
        System.out.println("For set " + set1 + " and key " + key1 + ", result: " + result1); // Output: 30

        Integer key2 = 55;
        Integer result2 = getLeastSetGreaterThanKey(set1, key2);
        System.out.println("For set " + set1 + " and key " + key2 + ", result: " + result2); // Output: null


        TreeSet<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        String key3 = "apricot";
        String result3 = getLeastSetGreaterThanKey(set2, key3);
        System.out.println("For set " + set2 + " and key " + key3 + ", result: " + result3); // Output: banana


        String key4 = "zucchini";
        String result4 = getLeastSetGreaterThanKey(set2, key4);
        System.out.println("For set " + set2 + " and key " + key4 + ", result: " + result4); // Output: null
    }

    public static <T> T getLeastSetGreaterThanKey(TreeSet<T> set, T key) {
        if (set == null || set.isEmpty()) {
            return null;
        }

        // higher() method in TreeSet returns the least element strictly greater than the given key
        return set.higher(key); 
    }
}

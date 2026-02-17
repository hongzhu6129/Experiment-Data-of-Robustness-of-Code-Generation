import java.util.TreeSet;

public class LeastKeyGreaterThanGivenKey {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(20);
        treeSet1.add(30);
        treeSet1.add(40);
        treeSet1.add(50);


        Integer key1 = 25;
        Integer result1 = getLeastKeyGreaterThan(treeSet1, key1);
        System.out.println("Least key greater than " + key1 + ": " + result1); // Output: 30

        Integer key2 = 50;
        Integer result2 = getLeastKeyGreaterThan(treeSet1, key2);
        System.out.println("Least key greater than " + key2 + ": " + result2); // Output: null


        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("apple");
        treeSet2.add("banana");
        treeSet2.add("orange");

        String key3 = "apricot";
        String result3 = getLeastKeyGreaterThan(treeSet2, key3);
        System.out.println("Least key greater than " + key3 + ": " + result3); // Output: banana


        // Test with an empty set
        TreeSet<Integer> emptySet = new TreeSet<>();
        Integer key4 = 5;
        Integer result4 = getLeastKeyGreaterThan(emptySet, key4);
        System.out.println("Least key greater than " + key4 + " in empty set : " + result4); // Output: null

    }


    public static <T> T getLeastKeyGreaterThan(TreeSet<T> treeSet, T key) {
        if (treeSet == null || treeSet.isEmpty()) {
            return null;
        }
        return treeSet.higher(key);
    }
}

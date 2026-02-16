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


        TreeSet<Integer> emptySet = new TreeSet<>();
        Integer key3 = 5;
        Integer result3 = getLeastKeyGreaterThan(emptySet, key3);
        System.out.println("Least key greater than " + key3 + " in empty set: " + result3); // Output: null


        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String stringKey = "apricot";  // Comes after "apple" lexicographically
        String stringResult = getLeastKeyGreaterThan(stringTreeSet, stringKey);
        System.out.println("Least key greater than " + stringKey + ": " + stringResult); // Output: banana

    }


    public static <T> T getLeastKeyGreaterThan(TreeSet<T> treeSet, T key) {
        if (treeSet == null || treeSet.isEmpty()) {
            return null;
        }
        
        return treeSet.higher(key); 
    }
}

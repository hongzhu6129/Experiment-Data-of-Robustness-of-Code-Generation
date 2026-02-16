import java.util.TreeSet;

public class GreatestSetLessThanKey {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        int key1 = 4;
        TreeSet<Integer> result1 = getGreatestSetLessThanKey(set1, key1);
        System.out.println("Set: " + set1 + ", Key: " + key1 + ", Result: " + result1); // Expected: [1, 2, 3]


        int key2 = 1;
        TreeSet<Integer> result2 = getGreatestSetLessThanKey(set1, key2);
        System.out.println("Set: " + set1 + ", Key: " + key2 + ", Result: " + result2); // Expected: null

        int key3 = 6;
        TreeSet<Integer> result3 = getGreatestSetLessThanKey(set1, key3);
        System.out.println("Set: " + set1 + ", Key: " + key3 + ", Result: " + result3); // Expected: [1, 2, 3, 4, 5]



        TreeSet<Integer> set2 = new TreeSet<>();  // Empty set
        int key4 = 5;
        TreeSet<Integer> result4 = getGreatestSetLessThanKey(set2, key4);
        System.out.println("Set: " + set2 + ", Key: " + key4 + ", Result: " + result4); // Expected: null


    }

    public static TreeSet<Integer> getGreatestSetLessThanKey(TreeSet<Integer> set, int key) {
        if (set == null ) { // Handle null input set
            return null; 
        }

        TreeSet<Integer> subset = (TreeSet<Integer>) set.headSet(key);

        if (subset.isEmpty()) {
            return null;
        } else {
            return subset;
        }
    }
}

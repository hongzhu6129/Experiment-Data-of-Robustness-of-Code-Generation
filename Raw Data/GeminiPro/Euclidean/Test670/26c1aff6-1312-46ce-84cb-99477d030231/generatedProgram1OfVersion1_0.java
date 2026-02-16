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

        int key1 = 6;
        TreeSet<Integer> result1 = getGreatestSetLessThanKey(set1, key1);
        System.out.println("Result 1: " + result1); // Output: Result 1: [1, 2, 3, 4, 5]

        int key2 = 4;
        TreeSet<Integer> result2 = getGreatestSetLessThanKey(set1, key2);
        System.out.println("Result 2: " + result2); // Output: Result 2: [1, 2, 3]


        TreeSet<Integer> set2 = new TreeSet<>(); // Empty set
        int key3 = 5;
        TreeSet<Integer> result3 = getGreatestSetLessThanKey(set2, key3);
        System.out.println("Result 3: " + result3); // Output: Result 3: null


         TreeSet<Integer> set3 = new TreeSet<>(); 
        set3.add(5);
        set3.add(10);
        int key4 = 1; // Key smaller than all elements
        TreeSet<Integer> result4 = getGreatestSetLessThanKey(set3, key4);
        System.out.println("Result 4: " + result4); // Output: Result 4: null




    }

    public static TreeSet<Integer> getGreatestSetLessThanKey(TreeSet<Integer> set, int key) {
        TreeSet<Integer> subset = new TreeSet<>();

        if (set == null || set.isEmpty()) {
            if(key > Integer.MIN_VALUE) { //There's potentially a set less than the key
                return new TreeSet<>(); // Return an empty TreeSet indicating a set less than the key exists 
            }
            return null;
        }



        for (Integer element : set) {
            if (element < key) {
                subset.add(element);
            }
        }


        if (subset.isEmpty()) {
            return null; // Return null because no elements in set are smaller than the key
        }
        
        return subset;
    }
}

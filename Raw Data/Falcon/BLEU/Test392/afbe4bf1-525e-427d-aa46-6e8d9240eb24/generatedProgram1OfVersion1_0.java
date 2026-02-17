import java.util.TreeSet;

public class GreatestKeyLessThanGiven {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        Integer key1 = 35;
        Integer result1 = getGreatestKeyLessThan(set1, key1);
        System.out.println("Set: " + set1 + ", Key: " + key1 + ", Result: " + result1); // Output: 30


        Integer key2 = 15;
        Integer result2 = getGreatestKeyLessThan(set1, key2);
        System.out.println("Set: " + set1 + ", Key: " + key2 + ", Result: " + result2); // Output: 10

        Integer key3 = 5;
        Integer result3 = getGreatestKeyLessThan(set1, key3);
        System.out.println("Set: " + set1 + ", Key: " + key3 + ", Result: " + result3); // Output: null


        TreeSet<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        String key4 = "grape";
        String result4 = getGreatestKeyLessThan(set2, key4);
        System.out.println("Set: " + set2 + ", Key: " + key4 + ", Result: " + result4); // Output: banana

         String key5 = "aardvark"; // Less than all elements
        String result5 = getGreatestKeyLessThan(set2, key5);
        System.out.println("Set: " + set2 + ", Key: " + key5 + ", Result: " + result5); // Output: null



    }


    public static <T> T getGreatestKeyLessThan(TreeSet<T> set, T key) {
        if (set == null || set.isEmpty()) {
            return null;
        }

        T lower = set.lower(key);  // Use TreeSet's lower() method

        return lower;

    }
}

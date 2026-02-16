import java.util.TreeMap;

public class NoneKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        Integer key1 = 4;
        Integer result1 = getNoneKeyGreaterThanOrEqualTo(treeMap, key1);
        System.out.println("For key " + key1 + ": " + result1); // Output: 5

        Integer key2 = 9;
        Integer result2 = getNoneKeyGreaterThanOrEqualTo(treeMap, key2);
        System.out.println("For key " + key2 + ": " + result2);  // Output: null


        Integer key3 = 0;
        Integer result3 = getNoneKeyGreaterThanOrEqualTo(treeMap, key3);
        System.out.println("For key " + key3 + ": " + result3);  // Output: 1


        TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();
        Integer key4 = 5;
        Integer result4 = getNoneKeyGreaterThanOrEqualTo(emptyTreeMap, key4);
        System.out.println("For key " + key4 + ": " + result4); // Output: null

    }

    public static <K extends Comparable<K>, V> K getNoneKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        K higherKey = treeMap.higherKey(key); // Get the least key strictly greater than the given key

        if(higherKey != null) {
            return higherKey;
        } else if (treeMap.containsKey(key)){ // If the key itself is present
             return null; //  since we are looking for NONE key
        }
        else {
            // If there's no key strictly greater, check for key equal to or greater than
            K ceilingKey = treeMap.ceilingKey(key);
            if(ceilingKey != null && !ceilingKey.equals(key)) { // Exclude if ceiling key equals the provided key
               return ceilingKey;
            } else if(treeMap.containsKey(key))
            {
                return null; //If the provided key is present, there is no none key
            } else {
                 return ceilingKey; // return the ceiling key regardless
            }
        }
    }
}




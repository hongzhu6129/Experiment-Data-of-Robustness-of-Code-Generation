import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 35;
        Integer lowerKey1 = treeMap.lowerKey(key1);
        System.out.println("Greatest key less than " + key1 + ": " + lowerKey1); // Output: 30

        Integer key2 = 15;
        Integer lowerKey2 = treeMap.lowerKey(key2);
        System.out.println("Greatest key less than " + key2 + ": " + lowerKey2); // Output: 10


        Integer key3 = 5;
        Integer lowerKey3 = treeMap.lowerKey(key3);
        System.out.println("Greatest key less than " + key3 + ": " + lowerKey3); // Output: null


        // Example with different data types:
        TreeMap<Double, String> treeMap2 = new TreeMap<>();
        treeMap2.put(1.5, "One point five");
        treeMap2.put(2.7, "Two point seven");
        treeMap2.put(3.2, "Three point two");

        Double key4 = 2.8;
        Double lowerKey4 = treeMap2.lowerKey(key4);
        System.out.println("Greatest key less than " + key4 + ": " + lowerKey4); // Output: 2.7

        
        Double key5 = 1.0;
        Double lowerKey5 = treeMap2.lowerKey(key5);
        System.out.println("Greatest key less than " + key5 + ": " + lowerKey5); // Output: null
    }
}

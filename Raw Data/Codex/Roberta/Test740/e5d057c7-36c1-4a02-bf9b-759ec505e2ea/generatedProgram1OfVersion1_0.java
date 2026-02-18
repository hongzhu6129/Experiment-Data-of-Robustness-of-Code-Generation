import java.util.TreeSet;

public class GreatestSetLessThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        int key1 = 35;
        int key2 = 20;
        int key3 = 5;
        int key4 = 60;

        System.out.println("Greatest set less than or equal to " + key1 + ": " + getGreatestSetLessThanOrEqual(set, key1)); // Output: 30
        System.out.println("Greatest set less than or equal to " + key2 + ": " + getGreatestSetLessThanOrEqual(set, key2)); // Output: 20
        System.out.println("Greatest set less than or equal to " + key3 + ": " + getGreatestSetLessThanOrEqual(set, key3)); // Output: null 
        System.out.println("Greatest set less than or equal to " + key4 + ": " + getGreatestSetLessThanOrEqual(set, key4)); // Output: 50
    }

    public static <T extends Comparable<T>> T getGreatestSetLessThanOrEqual(TreeSet<T> set, T key) {
       return set.floor(key); 
    }
}

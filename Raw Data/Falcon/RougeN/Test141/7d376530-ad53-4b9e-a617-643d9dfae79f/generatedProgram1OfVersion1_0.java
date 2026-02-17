import java.util.HashSet;

public class EmptyHashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        System.out.println("HashSet before emptying: " + hashSet);

        // Empty the HashSet using the clear() method
        hashSet.clear();

        System.out.println("HashSet after emptying: " + hashSet); 
    }
}

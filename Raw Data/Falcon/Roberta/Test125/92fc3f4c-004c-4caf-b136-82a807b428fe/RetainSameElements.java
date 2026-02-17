import java.util.HashSet;
import java.util.Set;

public class RetainSameElements {

    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");
        set1.add("grape");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("orange");
        set2.add("kiwi");
        set2.add("mango");


        // Retain elements that are present in both sets (Intersection)
        set1.retainAll(set2); // modifies set1

        System.out.println("Common elements:");
        for (String element : set1) {
            System.out.println(element); 
        }


        // Demonstrating with Integer sets
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);

        numbers1.retainAll(numbers2);

        System.out.println("\nCommon numbers:");
        for (Integer num : numbers1) {
            System.out.println(num);
        }
    }
}

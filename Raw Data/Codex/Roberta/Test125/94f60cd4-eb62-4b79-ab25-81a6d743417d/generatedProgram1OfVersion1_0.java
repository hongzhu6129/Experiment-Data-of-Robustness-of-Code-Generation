import java.util.HashSet;
import java.util.Set;

public class SetComparison {

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


        // Method 1: Using retainAll() (modifies set1)
        set1.retainAll(set2); 
        System.out.println("Common elements (using retainAll): " + set1);


        // Method 2:  Creating a new set with common elements (doesn't modify original sets)
        Set<String> set1Copy = new HashSet<>(set1); //Avoid modifying the original set1
        Set<String> set2Copy = new HashSet<>(set2); //Avoid modifying the original set2

        Set<String> intersection = new HashSet<>(set1Copy);
        intersection.retainAll(set2Copy);

        System.out.println("Common elements (using intersection): " + intersection);



        //For larger sets where performance is critical, consider this approach:

       /* Set<String> smallerSet = set1.size() < set2.size() ? new HashSet<>(set1) : new HashSet<>(set2); //Make a copy
        Set<String> largerSet = set1.size() >= set2.size() ? set2 : set1;

        Set<String> commonElements = new HashSet<>();
        for(String element : smallerSet){
            if(largerSet.contains(element)){
                commonElements.add(element);
            }
        }
        System.out.println("Common elements (optimized for large sets): " + commonElements); */
    }
}

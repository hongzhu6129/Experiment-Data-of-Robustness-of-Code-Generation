import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(2); // Duplicate
        listWithDuplicates.add(4);
        listWithDuplicates.add(1); // Duplicate
        listWithDuplicates.add(5);

        List<Integer> listWithoutDuplicates = removeDuplicates(listWithDuplicates);

        System.out.println("Original list: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);


        // Example with Strings:
        List<String> stringListWithDuplicates = new ArrayList<>();
        stringListWithDuplicates.add("apple");
        stringListWithDuplicates.add("banana");
        stringListWithDuplicates.add("orange");
        stringListWithDuplicates.add("apple");
        stringListWithDuplicates.add("grape");

        List<String> stringListWithoutDuplicates = removeDuplicates(stringListWithDuplicates);

        System.out.println("Original string list: " + stringListWithDuplicates);
        System.out.println("String list without duplicates: " + stringListWithoutDuplicates);


    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        // Use a Set to store unique elements while preserving insertion order (LinkedHashSet)
        Set<T> set = new LinkedHashSet<>(list); 

        // Create a new list from the Set (which automatically removes duplicates)
        return new ArrayList<>(set); 
    }
}




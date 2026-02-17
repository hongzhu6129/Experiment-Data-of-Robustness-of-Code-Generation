import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

    public static void main(String[] args) {
        // Using a Comparator via lambda expression for descending order
        TreeMap<String, Integer> treeMapDesc = new TreeMap<>( (s1, s2) -> compare(s2, s1)); 

        treeMapDesc.put("apple", 1);
        treeMapDesc.put("banana", 2);
        treeMapDesc.put("orange", 3);
        treeMapDesc.put("grape", 4);

        System.out.println("Descending order TreeMap:");
        System.out.println(treeMapDesc);


        // Using a Comparator via method reference for ascending order
        TreeMap<String, Integer> treeMapAsc = new TreeMap<>(TreeMapSort::compare); // Method reference

        treeMapAsc.put("apple", 1);
        treeMapAsc.put("banana", 2);
        treeMapAsc.put("orange", 3);
        treeMapAsc.put("grape", 4);


        System.out.println("\nAscending order TreeMap:");
        System.out.println(treeMapAsc);


    }


    public static int compare(String s1, String s2) {
        // Basic string comparison for ascending order
        return s1.compareTo(s2); 
    }
}

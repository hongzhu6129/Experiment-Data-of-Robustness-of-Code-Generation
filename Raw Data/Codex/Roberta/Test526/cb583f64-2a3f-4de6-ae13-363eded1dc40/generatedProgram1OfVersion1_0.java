import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 35;

        // Find elements less than or equal to the given element
        TreeSet<Integer> lessOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true); 

        // Print the elements
        System.out.println("Elements less than or equal to " + givenElement + ": " + lessOrEqualSet);


        givenElement = 20;
         lessOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true); 
        System.out.println("Elements less than or equal to " + givenElement + ": " + lessOrEqualSet);



        //Example with strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("grape");

        String givenString = "orange";
        TreeSet<String> lessOrEqualStrings = (TreeSet<String>) stringTreeSet.headSet(givenString, true);
        System.out.println("Strings less than or equal to \"" + givenString + "\": " + lessOrEqualStrings);



    }
}

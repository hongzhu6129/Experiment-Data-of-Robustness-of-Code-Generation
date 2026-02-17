import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for
        Integer element = 40;

        // Get the element lower than the given element
        Integer lowerElement = treeSet.lower(element);


        // Print the result
        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with String
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String strElement = "orange";
        String lowerStrElement = stringTreeSet.lower(strElement);

        if (lowerStrElement != null) {
            System.out.println("The element lower than " + strElement + " is: " + lowerStrElement);
        } else {
            System.out.println("No element found lower than " + strElement);
        }



        //Edge case examples - Empty TreeSet and element not present

        TreeSet<Integer> emptyTreeSet = new TreeSet<>();
        Integer nonExistentElement = 70;
        Integer lowerElementNull = emptyTreeSet.lower(nonExistentElement);  //Will be null because set is empty
        if(lowerElementNull == null){
              System.out.println("No element found lower than "+ nonExistentElement +  " in the empty set.");
        }


        Integer nonExistentElement2 = 75; //Not in the original treeSet, but there are elements lower than it.
        Integer result = treeSet.lower(nonExistentElement2); // Should return 50
        if(result != null) {
            System.out.println("The element lower than " + nonExistentElement2 + " is: " + result);
        } else {
            System.out.println("No element found lower than " + nonExistentElement2);
        }

        //Smallest element
        Integer smallestElement = 10;
        Integer lowerThanSmallest = treeSet.lower(smallestElement);
        if(lowerThanSmallest != null) {
            System.out.println("The element lower than " + smallestElement + " is: " + lowerThanSmallest);
        } else {
            System.out.println("No element found lower than " + smallestElement); //This will be printed as there's nothing smaller than 10.
        }

    }
}

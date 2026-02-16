import java.util.TreeSet;

public class TreeElementsLessThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 35;

        TreeSet<Integer> lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true); // Inclusive headSet

        System.out.println("Elements less than or equal to " + givenElement + ":");
        for (Integer element : lessThanOrEqualSet) {
            System.out.print(element + " ");
        }
        System.out.println();


        givenElement = 20;  //Another example
        lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true);

        System.out.println("Elements less than or equal to " + givenElement + ":");
         for (Integer element : lessThanOrEqualSet) {
            System.out.print(element + " ");
        }
        System.out.println();


          givenElement = 60; // Example where the element is larger than all elements in the set.
        lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true); 

        System.out.println("Elements less than or equal to " + givenElement + ":");
        for (Integer element : lessThanOrEqualSet) {  //Will print all elements in the tree.
            System.out.print(element + " ");
        }
        System.out.println();


    }
}

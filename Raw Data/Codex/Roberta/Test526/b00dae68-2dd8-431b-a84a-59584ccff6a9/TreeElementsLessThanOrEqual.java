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

        TreeSet<Integer> lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true); 

        System.out.println("Elements less than or equal to " + givenElement + ": " + lessThanOrEqualSet);


        givenElement = 20;
        lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true);
        System.out.println("Elements less than or equal to " + givenElement + ": " + lessThanOrEqualSet);


         givenElement = 60; // Example with an element greater than all in the set
        lessThanOrEqualSet = (TreeSet<Integer>) treeSet.headSet(givenElement, true);
        System.out.println("Elements less than or equal to " + givenElement + ": " + lessThanOrEqualSet);



    }
}

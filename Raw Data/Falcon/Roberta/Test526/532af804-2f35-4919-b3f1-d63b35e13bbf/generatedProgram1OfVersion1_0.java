import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the floor (greatest element less than or equal to)
        int element = 35;

        // Use floor() to get the element
        Integer floorElement = treeSet.floor(element);

        // Print the result
        if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }


        // Example with a different element
        element = 15;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }


        // Example with an element smaller than the smallest in the set.
        element = 5;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }


          // Example with an element equal to an existing element
          element = 30;
          floorElement = treeSet.floor(element);
  
           if (floorElement != null) {
              System.out.println("Floor of " + element + ": " + floorElement);
          } else {
              System.out.println("No element less than or equal to " + element + " found.");
          }


    }
}

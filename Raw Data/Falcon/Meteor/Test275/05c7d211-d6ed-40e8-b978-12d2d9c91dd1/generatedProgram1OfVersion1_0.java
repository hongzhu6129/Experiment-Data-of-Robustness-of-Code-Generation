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

        Integer floorElement = treeSet.floor(givenElement);

        if (floorElement != null) {
            System.out.println("The element less than or equal to " + givenElement + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + givenElement);
        }


        givenElement = 5;
        floorElement = treeSet.floor(givenElement);
         if (floorElement != null) {
            System.out.println("The element less than or equal to " + givenElement + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + givenElement);
        }



        givenElement = 60;
         floorElement = treeSet.floor(givenElement);
         if (floorElement != null) {
            System.out.println("The element less than or equal to " + givenElement + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + givenElement);
        }
    }
}

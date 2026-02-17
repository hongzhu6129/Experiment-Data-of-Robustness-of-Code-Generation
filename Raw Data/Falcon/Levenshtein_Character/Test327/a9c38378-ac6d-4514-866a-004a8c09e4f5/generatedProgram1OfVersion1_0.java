import java.util.TreeSet;

public class GreenSetLessThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> greenSet = new TreeSet<>();
        greenSet.add(10);
        greenSet.add(20);
        greenSet.add(30);
        greenSet.add(40);
        greenSet.add(50);

        int givenElement = 35;

        Integer lessThanOrEqualElement = greenSet.floor(givenElement);


        if (lessThanOrEqualElement != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqualElement);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }



        givenElement = 5; // Example with no smaller element
        lessThanOrEqualElement = greenSet.floor(givenElement);


        if (lessThanOrEqualElement != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqualElement);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }


          givenElement = 50; // Example where given element is present
        lessThanOrEqualElement = greenSet.floor(givenElement);


        if (lessThanOrEqualElement != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqualElement);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }
    }
}

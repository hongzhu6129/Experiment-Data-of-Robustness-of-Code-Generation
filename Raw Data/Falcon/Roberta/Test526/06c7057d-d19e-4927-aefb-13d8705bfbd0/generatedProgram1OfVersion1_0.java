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
        Integer lessThanOrEqual = greenSet.floor(givenElement);

        if (lessThanOrEqual != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqual);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }


        givenElement = 5;
        lessThanOrEqual = greenSet.floor(givenElement);

         if (lessThanOrEqual != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqual);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }

         givenElement = 50;
        lessThanOrEqual = greenSet.floor(givenElement);

         if (lessThanOrEqual != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + lessThanOrEqual);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found in the set.");
        }
    }
}

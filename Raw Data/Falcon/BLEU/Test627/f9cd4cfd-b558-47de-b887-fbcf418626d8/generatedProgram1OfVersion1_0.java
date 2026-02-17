import java.util.ArrayList;
import java.util.List;

public class ArrayListEmptyCheck {

    public static void main(String[] args) {

        // Create an empty ArrayList
        List<String> list1 = new ArrayList<>();

        // Check if the list is empty using isEmpty()
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty"); 
        }

        // Create an ArrayList with elements
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Check if the list is empty using isEmpty()
        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }


        // Check if the list is empty using size() - Less efficient, isEmpty() is preferred
        if (list2.size() == 0) {
            System.out.println("list2 is empty (using size())");
        } else {
            System.out.println("list2 is not empty (using size())");
        }

        // Example with null
        List<Double> list3 = null;


         if(list3 == null || list3.isEmpty()) { //Important: check for null first!
             System.out.println("list3 is null or empty");
         } else {
            System.out.println("List3 is not empty");
         }


    }
}

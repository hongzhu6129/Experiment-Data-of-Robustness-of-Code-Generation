import java.util.ArrayList;
import java.util.List;

public class CheckArrayListEmpty {

    public static void main(String[] args) {

        // Create an empty ArrayList
        List<String> list1 = new ArrayList<>();

        // Check if the ArrayList is empty using isEmpty()
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

        // Check if the ArrayList is empty using isEmpty()
        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }

         // Check if the ArrayList is empty using size() - less common but also works
        if (list2.size() == 0) {
            System.out.println("list2 is empty (using size)");
        } else {
            System.out.println("list2 is not empty (using size)");
        }



    }
}

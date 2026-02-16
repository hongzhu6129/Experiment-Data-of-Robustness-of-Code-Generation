import java.util.ArrayList;

public class CheckArrayListEmpty {

    public static void main(String[] args) {

        // Create an empty ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        // Check if the ArrayList is empty using isEmpty()
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }

        // Create an ArrayList with elements
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Check if the ArrayList is empty using isEmpty()
        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }

        // Another way to check (less preferred, but demonstrates size checking)
        ArrayList<Double> list3 = new ArrayList<>();
        if(list3.size() == 0) {
            System.out.println("list3 is empty");
        } else {
            System.out.println("list3 is not empty");
        }


    }
}

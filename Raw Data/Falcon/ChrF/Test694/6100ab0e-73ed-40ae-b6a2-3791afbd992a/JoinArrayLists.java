import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Grape");
        list2.add("Mango");
        list2.add("Pineapple");

        // Method 1: Using addAll()
        List<String> joinedList1 = new ArrayList<>(list1); // Create a copy to avoid modifying the original list1
        joinedList1.addAll(list2); 

        System.out.println("Joined list using addAll(): " + joinedList1);


        // Method 2: Creating a new list and adding elements individually (for illustration)
        List<String> joinedList2 = new ArrayList<>();
        for (String fruit : list1) {
            joinedList2.add(fruit);
        }
        for (String fruit : list2) {
            joinedList2.add(fruit);
        }

        System.out.println("Joined list by adding elements individually: " + joinedList2);


         //Example with Integer ArrayLists:

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        
        List<Integer> joinedNumbers = new ArrayList<>(numbers1);
        joinedNumbers.addAll(numbers2);

        System.out.println("Joined list of integers: " + joinedNumbers);


    }
}

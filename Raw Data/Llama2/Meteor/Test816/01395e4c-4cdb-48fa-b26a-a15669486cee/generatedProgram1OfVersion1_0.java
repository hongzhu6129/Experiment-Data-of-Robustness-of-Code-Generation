import java.util.ArrayList;
import java.util.List;

public class RemoveAllElements {

    public static void main(String[] args) {
        // Create a sample list (you can replace this with your own list)
        List<String> involvedList = new ArrayList<>();
        involvedList.add("element1");
        involvedList.add("element2");
        involvedList.add("element3");

        System.out.println("Original List: " + involvedList);

        // Remove all elements using clear()
        involvedList.clear(); 

        System.out.println("List after removing all elements: " + involvedList);


        // Demonstration with another type (e.g., Integer)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original Integer List: " + numbers);
        numbers.clear();
        System.out.println("Integer List after clearing: " + numbers);

    }
}

import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Check if the LinkedList is empty using isEmpty()
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }


        // Add some elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");


        // Check if the LinkedList is empty again
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }



        //Another way to check if the LinkedList is empty using size() == 0
         LinkedList<Integer> numbers = new LinkedList<>();

        if(numbers.size() == 0) {
            System.out.println("The numbers LinkedList is empty (using size()).");
        } else {
             System.out.println("The numbers LinkedList is not empty (using size()).");
        }

         numbers.add(1);
          numbers.add(2);

        if(numbers.size() == 0) {
            System.out.println("The numbers LinkedList is empty (using size()).");
        } else {
             System.out.println("The numbers LinkedList is not empty (using size()).");
        }



    }
}

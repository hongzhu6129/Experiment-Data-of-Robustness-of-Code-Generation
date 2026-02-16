import java.util.LinkedList;

public class RemoveAllFromLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements from the LinkedList
        linkedList.clear(); 

        System.out.println("LinkedList after removing all elements: " + linkedList);


        // Example using a loop and remove() (less efficient but demonstrates another way)
         LinkedList<Integer> numbers = new LinkedList<>();
        for(int i=1; i<=5; i++) {
            numbers.add(i);
        }
        System.out.println("Numbers before removal: " + numbers);

         while (!numbers.isEmpty()) { // Check if the list is empty before removing
            numbers.remove(); // Removes the first element 
        }
    //     OR
    //    for(int i=0; i< numbers.size(); i++) { // careful with remove in loop, use while or iterator if removing multiple elements
    //      numbers.remove(0); // or removeFirst()
    //    }
      

        System.out.println("Numbers after removal using loop: " + numbers);



    }
}

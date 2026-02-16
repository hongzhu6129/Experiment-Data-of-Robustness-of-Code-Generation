import java.util.LinkedList;

public class LinkedListOccurrences {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);

        int element = 2;

        int firstOccurrence = -1;
        int lastOccurrence = -1;


        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == element) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        System.out.println("First occurrence of " + element + ": " + firstOccurrence);
        System.out.println("Last occurrence of " + element + ": " + lastOccurrence);


         //Example with no occurrences:
        linkedList.clear();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(8);

        element = 9;  //Element not present

        firstOccurrence = -1;
        lastOccurrence = -1;

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == element) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        System.out.println("First occurrence of " + element + ": " + firstOccurrence);
        System.out.println("Last occurrence of " + element + ": " + lastOccurrence);



    }
}

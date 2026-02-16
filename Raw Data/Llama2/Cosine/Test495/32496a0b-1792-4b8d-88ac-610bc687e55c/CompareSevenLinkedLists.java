import java.util.LinkedList;

public class CompareSevenLinkedLists {

    public static void main(String[] args) {
        // Create seven LinkedList objects
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<Integer> list4 = new LinkedList<>();
        LinkedList<Integer> list5 = new LinkedList<>();
        LinkedList<Integer> list6 = new LinkedList<>();
        LinkedList<Integer> list7 = new LinkedList<>();


        // Populate the lists with some sample data (you can modify this)
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add(1);
        list3.add(2); 
        list3.add(4); // Different element

        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4); // Different size

        list5.add(1);
        list5.add(2);
        list5.add(3);

        list6.add(1);
        list6.add(2);
        list6.add(3);

        list7.add(1);
        list7.add(2);
        list7.add(3);


        // Compare the lists
        boolean allEqual = true;

        if (!list1.equals(list2)) allEqual = false;
        if (!list1.equals(list3)) allEqual = false;
        if (!list1.equals(list4)) allEqual = false;
        if (!list1.equals(list5)) allEqual = false;
        if (!list1.equals(list6)) allEqual = false;
        if (!list1.equals(list7)) allEqual = false;




        if (allEqual) {
            System.out.println("All seven LinkedLists are equal.");
        } else {
            System.out.println("The seven LinkedLists are not all equal.");


            // More detailed comparison (optional) - show which lists are different
             System.out.println("List 1 equals List 2: " + list1.equals(list2));
             System.out.println("List 1 equals List 3: " + list1.equals(list3));
             System.out.println("List 1 equals List 4: " + list1.equals(list4));
             // ... and so on for other comparisons
        }
    }
}

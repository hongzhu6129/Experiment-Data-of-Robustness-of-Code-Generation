import java.util.ArrayList;
import java.util.Collections;

public class CheckBesideArrayList {

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);  // Beside

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 3, 5, 7, 9); // Not beside

        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 5, 4, 3, 2, 1); // Beside (descending)

        ArrayList<Integer> list4 = new ArrayList<>();  // Empty - consider beside (trivially)
        

        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 4, 5); // Not beside

        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1); // Beside (single element)



        System.out.println("list1 is beside: " + isBeside(list1));
        System.out.println("list2 is beside: " + isBeside(list2));
        System.out.println("list3 is beside: " + isBeside(list3));
        System.out.println("list4 is beside: " + isBeside(list4));
        System.out.println("list5 is beside: " + isBeside(list5));
        System.out.println("list6 is beside: " + isBeside(list6));
    }

    private static boolean isBeside(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return true; // Empty or single-element lists are considered "beside"
        }

        // Determine if the list is ascending or descending
        boolean ascending = list.get(1) > list.get(0); 

        for (int i = 1; i < list.size(); i++) {
            if (ascending) {
                if (list.get(i) - list.get(i - 1) != 1) {
                    return false;
                }
            } else { // Descending
                if (list.get(i - 1) - list.get(i) != 1) {
                    return false;
                }
            }
        }

        return true;
    }
}


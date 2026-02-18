import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 7, 9, 40));
        List<Integer> list2 = new ArrayList<>(List.of(2, 13));

        List<Integer> mergedList = merge(list1, list2);

        System.out.print("merge two sorted listst: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

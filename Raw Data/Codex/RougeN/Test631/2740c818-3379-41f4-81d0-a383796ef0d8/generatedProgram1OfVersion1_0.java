import java.util.ArrayList;
import java.util.List;

class MergeSortedLists {

    public static List<Integer> mergeTwoSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

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


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(9);
        list1.add(40);


        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(13);

        List<Integer> mergedList = mergeTwoSortedLists(list1, list2);

        System.out.print("Merge Two Sorted ListsT: ");
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
    }
}

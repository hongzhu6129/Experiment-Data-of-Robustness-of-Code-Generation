import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class StringSorter {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");


        System.out.println("Original list: " + strings);

        List<String> ascendingSorted = sort(strings, true);
        System.out.println("Ascending sorted list: " + ascendingSorted);

        List<String> descendingSorted = sort(strings, false);
        System.out.println("Descending sorted list: " + descendingSorted);


    }

    public static List<String> sort(List<String> list, boolean ascending) {
        List<String> sortedList = new ArrayList<>(list); // Create a copy to avoid modifying the original
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new StringSortAction(sortedList, 0, sortedList.size(), ascending));
        return sortedList;
    }


    private static class StringSortAction extends RecursiveAction {
        private final List<String> list;
        private final int start;
        private final int end;
        private final boolean ascending;

        public StringSortAction(List<String> list, int start, int end, boolean ascending) {
            this.list = list;
            this.start = start;
            this.end = end;
            this.ascending = ascending;
        }

        @Override
        protected void compute() {
            if (end - start <= 1) { // Base case: list of size 0 or 1 is already sorted
                return;
            }

            int mid = (start + end) / 2;
            invokeAll(new StringSortAction(list, start, mid, ascending),
                      new StringSortAction(list, mid, end, ascending));

            merge(start, mid, end);
        }


        private void merge(int start, int mid, int end) {
            List<String> merged = new ArrayList<>();
            int i = start;
            int j = mid;

            while (i < mid && j < end) {
                if (ascending ? list.get(i).compareTo(list.get(j)) <= 0 :  list.get(i).compareTo(list.get(j)) >= 0) {
                    merged.add(list.get(i++));
                } else {
                    merged.add(list.get(j++));
                }
            }

            while (i < mid) {
                merged.add(list.get(i++));
            }

            while (j < end) {
                merged.add(list.get(j++));
            }


            for (int k = 0; k < merged.size(); k++) {
                list.set(start + k, merged.get(k));
            }
        }
    }
}




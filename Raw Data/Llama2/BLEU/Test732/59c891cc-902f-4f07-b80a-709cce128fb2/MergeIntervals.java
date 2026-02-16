import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }


    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }
}

public class MergeIntervals {

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(16,19));


        ArrayList<Interval> mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (Interval interval : mergedIntervals) {
            System.out.print(interval + " ");
        }
        System.out.println();
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                 return i1.getStart() - i2.getStart(); // Sort based on start times
            }
        });


        ArrayList<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            if (currentInterval.getEnd() >= nextInterval.getStart()) {
                // Overlap: Merge intervals
                currentInterval = new Interval(currentInterval.getStart(), Math.max(currentInterval.getEnd(), nextInterval.getEnd()));
            } else {
                // No overlap: Add current interval to result and update current interval
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval; 
            }
        }

        // Add the last interval
        mergedIntervals.add(currentInterval);


        return mergedIntervals;
    }



}

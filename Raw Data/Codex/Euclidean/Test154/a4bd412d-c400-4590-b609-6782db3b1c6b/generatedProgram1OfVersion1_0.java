import java.util.Scanner;

public class HookChecker {

    public static boolean checkHooks(int[][] intervals) {
        // Check if any intervals overlap
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][1] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of intervals
        int n = scanner.nextInt();

        // Get the intervals
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        // Check if the intervals overlap
        boolean overlap = checkHooks(intervals);

        // Print the result
        if (overlap) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

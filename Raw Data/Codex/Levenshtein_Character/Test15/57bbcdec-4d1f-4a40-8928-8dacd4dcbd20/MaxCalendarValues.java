import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // 0-indexed (January is 0)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Maximum values (some are conceptually fixed, some depend on the calendar system)

        int maxYear = Integer.MAX_VALUE; //  Practical limit for year representation 
        int maxMonth = Calendar.DECEMBER; // Constant representing the highest month value
        int maxWeekOfYear = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR); // Varies slightly per year
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Varies by month and year

        System.out.println("Current Year: " + currentYear);
        System.out.println("Maximum Year (representable): " + maxYear);


        System.out.println("Current Month (0-indexed): " + currentMonth);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);
        System.out.println("Maximum Month (Name): " + getMonthName(maxMonth));

        System.out.println("Current Week of Year: " + currentWeekOfYear);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);

        System.out.println("Current Day of Month: " + currentDayOfMonth);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);

    }



    private static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month >= 0 && month <= 11) { //check bounds
            return monthNames[month];
        } else {
            return "Invalid Month"; // Handle invalid input gracefully
        }

    }
}

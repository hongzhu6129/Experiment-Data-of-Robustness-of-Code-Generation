class Solution {
    /**
     * Calculates the angle between the hour and minute hands of a clock.
     *
     * @param hour   The current hour (0-12).
     * @param minute The current minute (0-59).
     * @return The angle between the hour and minute hands in degrees.
     */
    static int calcAngle(double hour, double minute) {
        if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
            return -1; // Indicate invalid input
        }

        if (hour == 12) {
            hour = 0; 
        }

        // Calculate the position of the hour and minute hands in degrees
        double hourAngle = (hour * 60 + minute) * 0.5; // Hour hand moves 0.5 degrees per minute
        double minuteAngle = minute * 6;             // Minute hand moves 6 degrees per minute

        // Calculate the difference between the angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Return the smaller angle (<= 180 degrees)
        return (int) Math.min(angle, 360 - angle);    
    }



    public static void main(String[] args) {
        System.out.println(calcAngle(3, 0));    // Output: 90
        System.out.println(calcAngle(9, 0));    // Output: 270
        System.out.println(calcAngle(12, 0));   // Output: 0 or 360  (0 in this implementation)
        System.out.println(calcAngle(2, 30));   // Output: 105
        System.out.println(calcAngle(4, 40));   // Output: 100
        System.out.println(calcAngle(9, 60));   // Output: -1 (Invalid input)


    }
}

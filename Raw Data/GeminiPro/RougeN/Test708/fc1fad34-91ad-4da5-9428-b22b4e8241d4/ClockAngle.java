import java.util.Scanner;

class ClockAngle {

    static int calcAngle(double h, double m) {
        if (h < 0 || m < 0 || h > 12 || m > 60) {
            System.out.println("Wrong input");
            return -1; // Indicate an error
        }

        if (h == 12)
            h = 0;
        if (m == 60)
            m = 0;
            
        double hour_angle = (0.5 * (h * 60 + m));
        double minute_angle = (6 * m);

        double angle = Math.abs(hour_angle - minute_angle);

        angle = Math.min(360 - angle, angle);

        return (int) angle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hour (1-12): ");
        double hour = scanner.nextDouble();

        System.out.print("Enter the minutes (0-59): ");
        double minute = scanner.nextDouble();

        int angle = calcAngle(hour, minute);
        if (angle != -1) { // Check for error from calcAngle
            System.out.println("Angle between hour and minute hands: " + angle + " degrees");
        }

        scanner.close();
    }
}

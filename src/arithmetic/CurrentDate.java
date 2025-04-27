package arithmetic;
public class CurrentDate {
    public static void main(String[] args) {
        final int MILLISECCONDS_PER_SECOND = 1000;
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;

        long totalMilliseconds;
        long totalSeconds;
        long totalMinutes;
        long totalHours;

        long currentHour;
        long currentMinute;
        long currentSecond;

        totalMilliseconds = System.currentTimeMillis();

        totalSeconds = totalMilliseconds / MILLISECCONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY + 3;

        System.out.println("Current time = " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

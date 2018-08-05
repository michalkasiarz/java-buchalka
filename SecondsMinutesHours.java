public class SecondsMinutesHours {

    public static void main(String[] args) {
        String duration = getDurationString(222222222);
        System.out.println(duration);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return (hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid value";
        }
    }
}

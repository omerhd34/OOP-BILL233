package ADVANCED.Exercises4;

// Time1 class declaration maintains the time in 24-hour format.
public class Time1 {
    // private instance variables for hour, minute, and second
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // set a new time value using universal time; ensure that
    // the data remains consistent by setting invalid values to zero
    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);         // validate hour
        minute = ((m >= 0 && m < 60) ? m : 0);       // validate minute
        second = ((s >= 0 && s < 60) ? s : 0);       // validate second
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
/*
The initial universal time is: 00:00:00
The initial standard time is: 12:00:00 AM

Universal time after setTime is: 13:27:06
Standard time after setTime is: 1:27:06 PM

After attempting invalid settings:
Universal time: 00:00:00
Standard time: 12:00:00 AM

+--------------------------+
|         Time1            |
+--------------------------+
| - hour: int              |
| - minute: int            |
| - second: int            |
+--------------------------+
| + setTime(h: int, m: int, s: int): void        |
| + toUniversalString(): String                  |
| + toString(): String                           |
+--------------------------+

+-------------------------+
|        Time1Test        |
+-------------------------+
| + main(args: String[]): void |
+-------------------------+

*/
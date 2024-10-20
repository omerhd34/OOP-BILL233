package ADVANCED.Exercises4;

// Time1 object used in an application.
public class Time1Test {
    public static void main(String[] args) {
        // create and initialize a Time1 object
        Time1 time = new Time1(); // invokes Time1 constructor

        // output string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line

        // change time and output updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println(); // output a blank line

        // set time with invalid values; output updated time
        time.setTime(99, 99, 99);
        System.out.println("After attempting invalid settings:");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
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
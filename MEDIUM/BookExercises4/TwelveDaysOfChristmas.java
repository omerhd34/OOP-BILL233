package MEDIUM.BookExercises4;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        // 12 gün için döngü
        for (int day = 1; day <= 12; day++) {
            // Günün sıra numarasını yazdır
            System.out.print("On the ");
            switch (day) {
                case 1:  System.out.print("first"); break;
                case 2:  System.out.print("second"); break;
                case 3:  System.out.print("third"); break;
                case 4:  System.out.print("fourth"); break;
                case 5:  System.out.print("fifth"); break;
                case 6:  System.out.print("sixth"); break;
                case 7:  System.out.print("seventh"); break;
                case 8:  System.out.print("eighth"); break;
                case 9:  System.out.print("ninth"); break;
                case 10: System.out.print("tenth"); break;
                case 11: System.out.print("eleventh"); break;
                case 12: System.out.print("twelfth"); break;
            }
            System.out.println(" day of Christmas my true love sent to me:");

            // Hediyeleri yazdır
            switch (day) {
                case 12: System.out.println("Twelve drummers drumming,");
                case 11: System.out.println("Eleven pipers piping,");
                case 10: System.out.println("Ten lords a-leaping,");
                case 9:  System.out.println("Nine ladies dancing,");
                case 8:  System.out.println("Eight maids a-milking,");
                case 7:  System.out.println("Seven swans a-swimming,");
                case 6:  System.out.println("Six geese a-laying,");
                case 5:  System.out.println("Five golden rings,");
                case 4:  System.out.println("Four calling birds,");
                case 3:  System.out.println("Three French hens,");
                case 2:  System.out.println("Two turtle doves, and");
                case 1:  System.out.println("A partridge in a pear tree.");
                    break;
            }
            // Yeni bir satır ekle
            System.out.println();
        }
    }
}
/*
On the first day of Christmas my true love sent to me:
A partridge in a pear tree.

On the second day of Christmas my true love sent to me:
Two turtle doves, and
A partridge in a pear tree.

On the third day of Christmas my true love sent to me:
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the fourth day of Christmas my true love sent to me:
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the fifth day of Christmas my true love sent to me:
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the sixth day of Christmas my true love sent to me:
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the seventh day of Christmas my true love sent to me:
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the eighth day of Christmas my true love sent to me:
Eight maids a-milking,
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the ninth day of Christmas my true love sent to me:
Nine ladies dancing,
Eight maids a-milking,
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the tenth day of Christmas my true love sent to me:
Ten lords a-leaping,
Nine ladies dancing,
Eight maids a-milking,
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the eleventh day of Christmas my true love sent to me:
Eleven pipers piping,
Ten lords a-leaping,
Nine ladies dancing,
Eight maids a-milking,
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.

On the twelfth day of Christmas my true love sent to me:
Twelve drummers drumming,
Eleven pipers piping,
Ten lords a-leaping,
Nine ladies dancing,
Eight maids a-milking,
Seven swans a-swimming,
Six geese a-laying,
Five golden rings,
Four calling birds,
Three French hens,
Two turtle doves, and
A partridge in a pear tree.
 */